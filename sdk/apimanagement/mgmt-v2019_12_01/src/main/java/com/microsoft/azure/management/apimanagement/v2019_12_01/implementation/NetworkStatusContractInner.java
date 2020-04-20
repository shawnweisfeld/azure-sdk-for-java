/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import java.util.List;
import com.microsoft.azure.management.apimanagement.v2019_12_01.ConnectivityStatusContract;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network Status details.
 */
public class NetworkStatusContractInner {
    /**
     * Gets the list of DNS servers IPV4 addresses.
     */
    @JsonProperty(value = "dnsServers", required = true)
    private List<String> dnsServers;

    /**
     * Gets the list of Connectivity Status to the Resources on which the
     * service depends upon.
     */
    @JsonProperty(value = "connectivityStatus", required = true)
    private List<ConnectivityStatusContract> connectivityStatus;

    /**
     * Get gets the list of DNS servers IPV4 addresses.
     *
     * @return the dnsServers value
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set gets the list of DNS servers IPV4 addresses.
     *
     * @param dnsServers the dnsServers value to set
     * @return the NetworkStatusContractInner object itself.
     */
    public NetworkStatusContractInner withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * Get gets the list of Connectivity Status to the Resources on which the service depends upon.
     *
     * @return the connectivityStatus value
     */
    public List<ConnectivityStatusContract> connectivityStatus() {
        return this.connectivityStatus;
    }

    /**
     * Set gets the list of Connectivity Status to the Resources on which the service depends upon.
     *
     * @param connectivityStatus the connectivityStatus value to set
     * @return the NetworkStatusContractInner object itself.
     */
    public NetworkStatusContractInner withConnectivityStatus(List<ConnectivityStatusContract> connectivityStatus) {
        this.connectivityStatus = connectivityStatus;
        return this;
    }

}
