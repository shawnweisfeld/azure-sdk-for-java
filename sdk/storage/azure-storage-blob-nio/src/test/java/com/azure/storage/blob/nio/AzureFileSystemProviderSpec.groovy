/*
 * Copyright Microsoft Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.azure.storage.blob.nio

import spock.lang.Unroll

import java.nio.file.FileSystemAlreadyExistsException
import java.nio.file.FileSystemNotFoundException

class AzureFileSystemProviderSpec extends APISpec {
    def config = [:]
    AzureFileSystemProvider provider

    def setup() {
        config = initializeConfigMap()
        provider = new AzureFileSystemProvider()
    }

    def "FileSystemProvider createFileSystem"() {
        setup:
        config[AzureFileSystem.AZURE_STORAGE_ACCOUNT_KEY] = getAccountKey(PRIMARY_STORAGE)
        config[AzureFileSystem.AZURE_STORAGE_FILE_STORES] = generateContainerName()
        def uri = getAccountUri()

        when:
        provider.newFileSystem(uri, config)

        then:
        provider.getFileSystem(uri).isOpen()
        ((AzureFileSystem) provider.getFileSystem(uri)).getFileSystemName() == getAccountName(PRIMARY_STORAGE)
    }

    @Unroll
    def "FileSystemProvider createFileSystem invalid uri"() {
        when:
        provider.newFileSystem(uri, config)

        then:
        thrown(IllegalArgumentException)

        where:
        uri                        | _
        new URI("azc://path")      | _
        new URI("azb://path")      | _
        new URI("azb://?foo=bar")  | _
        new URI("azb://?account=") | _
    }

    def "FileSystemProvider createFileSystem duplicate"() {
        setup:
        config[AzureFileSystem.AZURE_STORAGE_FILE_STORES] = generateContainerName()
        config[AzureFileSystem.AZURE_STORAGE_ACCOUNT_KEY] = getAccountKey(PRIMARY_STORAGE)
        provider.newFileSystem(getAccountUri(), config)

        when:
        provider.newFileSystem(getAccountUri(), config)

        then:
        thrown(FileSystemAlreadyExistsException)
    }

    def "FileSystemProvider createFileSystem initial check fail"() {
        when:
        config[AzureFileSystem.AZURE_STORAGE_FILE_STORES] = generateContainerName()
        def badKey = getAccountKey(PRIMARY_STORAGE).getBytes()
        badKey[0]++
        config[AzureFileSystem.AZURE_STORAGE_ACCOUNT_KEY] = new String(badKey)
        provider.newFileSystem(getAccountUri(), config)

        then:
        thrown(IOException)

        when:
        provider.getFileSystem(getAccountUri())

        then:
        thrown(FileSystemNotFoundException)
    }

    def "FileSystemProvider getFileSystem not found"() {
        when:
        provider.getFileSystem(getAccountUri())

        then:
        thrown(FileSystemNotFoundException)
    }

    @Unroll
    def "FileSystemProvider getFileSystem IA"() {
        when:
        provider.getFileSystem(uri)

        then:
        thrown(IllegalArgumentException)

        where:
        uri                        | _
        new URI("azc://path")      | _
        new URI("azb://path")      | _
        new URI("azb://?foo=bar")  | _
        new URI("azb://?account=") | _
    }

    // TODO: Be sure to test directories
    // TODO: Be sure to test operating on containers that already have data

    // all apis should have a test that tries them after the FileSystem is closed to ensure they throw.

    def "FileSystemProvider getScheme"() {
        expect:
        provider.getScheme() == "azb"
    }
}
