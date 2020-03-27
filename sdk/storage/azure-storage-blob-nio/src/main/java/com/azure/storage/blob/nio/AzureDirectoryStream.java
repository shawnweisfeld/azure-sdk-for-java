// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.nio;

import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.blob.models.BlobItem;
import com.azure.storage.blob.models.BlobListDetails;
import com.azure.storage.blob.models.ListBlobsOptions;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * Is asynchronously closeable. Closing the stream from any thread will cause the stream to stop returning elements.
 *
 * {@inheritDoc}
 */
public class AzureDirectoryStream implements DirectoryStream<Path> {
    private final ClientLogger logger = new ClientLogger(AzureDirectoryStream.class);

    private final Path path;
    private final DirectoryStream.Filter<? super Path> filter;
    private boolean iteratorRequested = false;
    boolean closed = false;

    AzureDirectoryStream(Path path, DirectoryStream.Filter<? super Path> filter) {
        this.path = path;
        this.filter = filter;
    }

    @Override
    public Iterator<Path> iterator() {
        if (this.iteratorRequested) {
            throw LoggingUtility.logError(logger,
                new IllegalStateException("Only one iterator may be requested from a given directory stream"));
        }
        this.iteratorRequested = true;
        return new AzureDirectoryIterator(this, this.path, this.filter);
    }

    @Override
    public void close() throws IOException {
        this.closed = true;
    }

    private static class AzureDirectoryIterator implements Iterator<Path> {
        private final ClientLogger logger = new ClientLogger(AzureDirectoryIterator.class);

        private final AzureDirectoryStream parentStream;
        private final DirectoryStream.Filter<? super Path> filter;
        private final Iterator<BlobItem> blobIterator;
        private final Path path;
        private Path bufferedNext = null;
        private final Set<String> directoryPaths;

        AzureDirectoryIterator(AzureDirectoryStream parentStream, Path path,
            DirectoryStream.Filter<? super Path> filter) throws IOException {
            this.parentStream = parentStream;
            this.filter = filter;
            this.path = path;
            directoryPaths = new HashSet<>();
            if (path.isRoot()) {
                this.blobIterator = resource.getContainerClient().listBlobs().iterator();
            } else {
                AzureResource azureResource = new AzureResource(path);
                ListBlobsOptions listOptions = new ListBlobsOptions()
                    .setPrefix(azureResource.getBlobClient().getBlobName() + AzureFileSystem.PATH_SEPARATOR)
                    .setDetails(new BlobListDetails().setRetrieveMetadata(true));
                this.blobIterator = azureResource.getContainerClient()
                    .listBlobsByHierarchy(AzureFileSystem.PATH_SEPARATOR, listOptions, null).iterator();
            }
        }

        @Override
        public boolean hasNext() {
            // Closing the parent stream halts iteration.
            if (parentStream.closed) {
                return false;
            }

            // In case a customer calls hasNext multiple times in a row. If we've buffered an element, we have a next.
            if (this.bufferedNext != null) {
                return true;
            }

            /*
            Search for a new element that passes the filter and buffer it when found. If no such element is found,
            return false.
             */
            while (this.blobIterator.hasNext()) {
                BlobItem nextBlob = this.blobIterator.next();
                Path nextPath = getNextListResult(nextBlob);
                try {
                    if (this.filter.accept(nextPath) && passesDirectoryDuplicateFilter(nextPath, nextBlob)) {
                        this.bufferedNext = nextPath;
                        return true;
                    }
                } catch (IOException e) {
                    throw LoggingUtility.logError(logger, new DirectoryIteratorException(e));
                }
            }
            return false;
        }

        @Override
        public Path next() {
            if (this.bufferedNext == null) {
                if (!this.hasNext()) { // This will populate cachedNext in the process.
                    throw LoggingUtility.logError(logger, new NoSuchElementException());
                }
            }
            Path next = this.bufferedNext; // cachedNext will have been populated by hasNext()
            this.bufferedNext = null;
            return next;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private Path getNextListResult(BlobItem blobItem) {
            // Strip the root if it is present so we can relativize the list result, which never has a root.
            Path withoutRoot = this.path;
            if (withoutRoot.isAbsolute()) {
                withoutRoot = this.path.getRoot().relativize(this.path);
            }

            /*
            Listing results return the full blob path, and we don't want to duplicate the path we listed off of, so
            we relativize to remove it.
             */
            String blobName = blobItem.getName();
            Path relativeResult = withoutRoot.relativize(
                this.path.getFileSystem().getPath(blobName));

            // Resolve the cleaned list result against the original path for the final result.
            return this.path.resolve(relativeResult);
        }

        /*
        If there is a concrete directory with children, a given path will be returned twice: once as the marker blob
        and once as the prefix for its children. We don't want to return the item twice, and we have no guarantees on
        result ordering, so we have to maintain a cache of directory paths we've seen in order to de-dup.
         */
        private boolean passesDirectoryDuplicateFilter(Path path, BlobItem blob) {
            /*
            If the blob is not a prefix and the blob does not contain the directory metadata marker, it is a normal blob
            and therefore will not be duplicated.
             */
            if (!(blob.isPrefix() != null && blob.isPrefix())
                && !(blob.getMetadata() != null && blob.getMetadata().containsKey(AzureResource.DIR_METADATA_MARKER))) {
                return true;
            }

            // If the set contains this path, it means we've seen it before and we shouldn't return it again.
            if (this.directoryPaths.contains(path.toString())) {
                return false;
            }

            // We haven't seen this before. Track it and indicate it should be returned.
            this.directoryPaths.add(path.toString());
            return true;
        }
    }
}
