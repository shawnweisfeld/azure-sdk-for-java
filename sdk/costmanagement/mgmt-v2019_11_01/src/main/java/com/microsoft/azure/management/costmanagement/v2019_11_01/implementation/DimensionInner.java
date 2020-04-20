/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2019_11_01.implementation;

import java.util.List;
import org.joda.time.DateTime;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The DimensionInner model.
 */
@JsonFlatten
public class DimensionInner extends ProxyResource {
    /**
     * Dimension description.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Filter enabled.
     */
    @JsonProperty(value = "properties.filterEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean filterEnabled;

    /**
     * Grouping enabled.
     */
    @JsonProperty(value = "properties.groupingEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean groupingEnabled;

    /**
     * The data property.
     */
    @JsonProperty(value = "properties.data")
    private List<String> data;

    /**
     * Total number of data for the dimension.
     */
    @JsonProperty(value = "properties.total", access = JsonProperty.Access.WRITE_ONLY)
    private Integer total;

    /**
     * Dimension category.
     */
    @JsonProperty(value = "properties.category", access = JsonProperty.Access.WRITE_ONLY)
    private String category;

    /**
     * Usage start.
     */
    @JsonProperty(value = "properties.usageStart", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime usageStart;

    /**
     * Usage end.
     */
    @JsonProperty(value = "properties.usageEnd", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime usageEnd;

    /**
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "properties.nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get dimension description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get filter enabled.
     *
     * @return the filterEnabled value
     */
    public Boolean filterEnabled() {
        return this.filterEnabled;
    }

    /**
     * Get grouping enabled.
     *
     * @return the groupingEnabled value
     */
    public Boolean groupingEnabled() {
        return this.groupingEnabled;
    }

    /**
     * Get the data value.
     *
     * @return the data value
     */
    public List<String> data() {
        return this.data;
    }

    /**
     * Set the data value.
     *
     * @param data the data value to set
     * @return the DimensionInner object itself.
     */
    public DimensionInner withData(List<String> data) {
        this.data = data;
        return this;
    }

    /**
     * Get total number of data for the dimension.
     *
     * @return the total value
     */
    public Integer total() {
        return this.total;
    }

    /**
     * Get dimension category.
     *
     * @return the category value
     */
    public String category() {
        return this.category;
    }

    /**
     * Get usage start.
     *
     * @return the usageStart value
     */
    public DateTime usageStart() {
        return this.usageStart;
    }

    /**
     * Get usage end.
     *
     * @return the usageEnd value
     */
    public DateTime usageEnd() {
        return this.usageEnd;
    }

    /**
     * Get the link (url) to the next page of results.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

}
