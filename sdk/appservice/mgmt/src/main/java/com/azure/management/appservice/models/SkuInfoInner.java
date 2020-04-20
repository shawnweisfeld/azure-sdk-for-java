// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.azure.management.appservice.SkuCapacity;
import com.azure.management.appservice.SkuDescription;

/**
 * The SkuInfo model.
 */
@Fluent
public final class SkuInfoInner {
    /*
     * Resource type that this SKU applies to.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * Description of a SKU for a scalable resource.
     */
    @JsonProperty(value = "sku")
    private SkuDescription sku;

    /*
     * Description of the App Service plan scale options.
     */
    @JsonProperty(value = "capacity")
    private SkuCapacity capacity;

    /**
     * Get the resourceType property: Resource type that this SKU applies to.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Resource type that this SKU applies to.
     * 
     * @param resourceType the resourceType value to set.
     * @return the SkuInfoInner object itself.
     */
    public SkuInfoInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the sku property: Description of a SKU for a scalable resource.
     * 
     * @return the sku value.
     */
    public SkuDescription sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Description of a SKU for a scalable resource.
     * 
     * @param sku the sku value to set.
     * @return the SkuInfoInner object itself.
     */
    public SkuInfoInner withSku(SkuDescription sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the capacity property: Description of the App Service plan scale
     * options.
     * 
     * @return the capacity value.
     */
    public SkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Description of the App Service plan scale
     * options.
     * 
     * @param capacity the capacity value to set.
     * @return the SkuInfoInner object itself.
     */
    public SkuInfoInner withCapacity(SkuCapacity capacity) {
        this.capacity = capacity;
        return this;
    }
}
