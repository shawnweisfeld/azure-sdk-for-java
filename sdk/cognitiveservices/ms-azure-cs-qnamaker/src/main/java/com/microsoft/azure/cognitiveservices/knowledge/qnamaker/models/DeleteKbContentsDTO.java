/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PATCH body schema of Delete Operation in UpdateKb.
 */
public class DeleteKbContentsDTO {
    /**
     * List of Qna Ids to be deleted.
     */
    @JsonProperty(value = "ids")
    private List<Integer> ids;

    /**
     * List of sources to be deleted from knowledgebase.
     */
    @JsonProperty(value = "sources")
    private List<String> sources;

    /**
     * Get the ids value.
     *
     * @return the ids value
     */
    public List<Integer> ids() {
        return this.ids;
    }

    /**
     * Set the ids value.
     *
     * @param ids the ids value to set
     * @return the DeleteKbContentsDTO object itself.
     */
    public DeleteKbContentsDTO withIds(List<Integer> ids) {
        this.ids = ids;
        return this;
    }

    /**
     * Get the sources value.
     *
     * @return the sources value
     */
    public List<String> sources() {
        return this.sources;
    }

    /**
     * Set the sources value.
     *
     * @param sources the sources value to set
     * @return the DeleteKbContentsDTO object itself.
     */
    public DeleteKbContentsDTO withSources(List<String> sources) {
        this.sources = sources;
        return this;
    }

}
