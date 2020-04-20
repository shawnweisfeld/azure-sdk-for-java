// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PrivateLinkServiceVisibility model.
 */
@Fluent
public final class PrivateLinkServiceVisibilityInner {
    /*
     * Private Link Service Visibility (True/False).
     */
    @JsonProperty(value = "visible")
    private Boolean visible;

    /**
     * Get the visible property: Private Link Service Visibility (True/False).
     * 
     * @return the visible value.
     */
    public Boolean visible() {
        return this.visible;
    }

    /**
     * Set the visible property: Private Link Service Visibility (True/False).
     * 
     * @param visible the visible value to set.
     * @return the PrivateLinkServiceVisibilityInner object itself.
     */
    public PrivateLinkServiceVisibilityInner withVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }
}
