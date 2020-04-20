// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResourceNameAvailabilityRequest model.
 */
@Fluent
public final class ResourceNameAvailabilityRequest {
    /*
     * Resource name to verify.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Resource type used for verification.
     */
    @JsonProperty(value = "type", required = true)
    private CheckNameResourceTypes type;

    /*
     * Is fully qualified domain name.
     */
    @JsonProperty(value = "isFqdn")
    private Boolean isFqdn;

    /**
     * Get the name property: Resource name to verify.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name to verify.
     * 
     * @param name the name value to set.
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type used for verification.
     * 
     * @return the type value.
     */
    public CheckNameResourceTypes type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type used for verification.
     * 
     * @param type the type value to set.
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withType(CheckNameResourceTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get the isFqdn property: Is fully qualified domain name.
     * 
     * @return the isFqdn value.
     */
    public Boolean isFqdn() {
        return this.isFqdn;
    }

    /**
     * Set the isFqdn property: Is fully qualified domain name.
     * 
     * @param isFqdn the isFqdn value to set.
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withIsFqdn(Boolean isFqdn) {
        this.isFqdn = isFqdn;
        return this;
    }
}
