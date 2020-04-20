// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The LoadBalancerFrontendIPConfigurationListResult model.
 */
@Fluent
public final class LoadBalancerFrontendIPConfigurationListResultInner {
    /*
     * A list of frontend IP configurations in a load balancer.
     */
    @JsonProperty(value = "value")
    private List<FrontendIPConfigurationInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: A list of frontend IP configurations in a load
     * balancer.
     * 
     * @return the value value.
     */
    public List<FrontendIPConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of frontend IP configurations in a load
     * balancer.
     * 
     * @param value the value value to set.
     * @return the LoadBalancerFrontendIPConfigurationListResultInner object
     * itself.
     */
    public LoadBalancerFrontendIPConfigurationListResultInner withValue(List<FrontendIPConfigurationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }
}
