/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.file.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.microsoft.rest.v2.DateTimeRfc1123;
import java.time.OffsetDateTime;

/**
 * Properties of a share.
 */
@JacksonXmlRootElement(localName = "ShareProperties")
public final class ShareProperties {
    /**
     * The lastModified property.
     */
    @JsonProperty(value = "Last-Modified", required = true)
    private DateTimeRfc1123 lastModified;

    /**
     * The etag property.
     */
    @JsonProperty(value = "Etag", required = true)
    private String etag;

    /**
     * The quota property.
     */
    @JsonProperty(value = "Quota", required = true)
    private int quota;

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.dateTime();
    }

    /**
     * Set the lastModified value.
     *
     * @param lastModified the lastModified value to set.
     * @return the ShareProperties object itself.
     */
    public ShareProperties withLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set.
     * @return the ShareProperties object itself.
     */
    public ShareProperties withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the quota value.
     *
     * @return the quota value.
     */
    public int quota() {
        return this.quota;
    }

    /**
     * Set the quota value.
     *
     * @param quota the quota value to set.
     * @return the ShareProperties object itself.
     */
    public ShareProperties withQuota(int quota) {
        this.quota = quota;
        return this;
    }
}
