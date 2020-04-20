// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.management.network.IpsecPolicy;
import com.azure.management.network.TunnelConnectionHealth;
import com.azure.management.network.VirtualNetworkGatewayConnectionProtocol;
import com.azure.management.network.VirtualNetworkGatewayConnectionStatus;
import com.azure.management.network.VirtualNetworkGatewayConnectionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The VirtualNetworkGatewayConnection model.
 */
@JsonFlatten
@Fluent
public class VirtualNetworkGatewayConnectionInner extends Resource {
    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The authorizationKey.
     */
    @JsonProperty(value = "properties.authorizationKey")
    private String authorizationKey;

    /*
     * A common class for general resource information.
     */
    @JsonProperty(value = "properties.virtualNetworkGateway1", required = true)
    private VirtualNetworkGatewayInner virtualNetworkGateway1;

    /*
     * A common class for general resource information.
     */
    @JsonProperty(value = "properties.virtualNetworkGateway2")
    private VirtualNetworkGatewayInner virtualNetworkGateway2;

    /*
     * A common class for general resource information.
     */
    @JsonProperty(value = "properties.localNetworkGateway2")
    private LocalNetworkGatewayInner localNetworkGateway2;

    /*
     * Gateway connection type.
     */
    @JsonProperty(value = "properties.connectionType", required = true)
    private VirtualNetworkGatewayConnectionType connectionType;

    /*
     * Gateway connection protocol.
     */
    @JsonProperty(value = "properties.connectionProtocol")
    private VirtualNetworkGatewayConnectionProtocol connectionProtocol;

    /*
     * The routing weight.
     */
    @JsonProperty(value = "properties.routingWeight")
    private Integer routingWeight;

    /*
     * The IPSec shared key.
     */
    @JsonProperty(value = "properties.sharedKey")
    private String sharedKey;

    /*
     * Virtual Network Gateway connection status.
     */
    @JsonProperty(value = "properties.connectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkGatewayConnectionStatus connectionStatus;

    /*
     * Collection of all tunnels' connection health status.
     */
    @JsonProperty(value = "properties.tunnelConnectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private List<TunnelConnectionHealth> tunnelConnectionStatus;

    /*
     * The egress bytes transferred in this connection.
     */
    @JsonProperty(value = "properties.egressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long egressBytesTransferred;

    /*
     * The ingress bytes transferred in this connection.
     */
    @JsonProperty(value = "properties.ingressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long ingressBytesTransferred;

    /*
     * Reference to another subresource.
     */
    @JsonProperty(value = "properties.peer")
    private SubResource peer;

    /*
     * EnableBgp flag.
     */
    @JsonProperty(value = "properties.enableBgp")
    private Boolean enableBgp;

    /*
     * Enable policy-based traffic selectors.
     */
    @JsonProperty(value = "properties.usePolicyBasedTrafficSelectors")
    private Boolean usePolicyBasedTrafficSelectors;

    /*
     * The IPSec Policies to be considered by this connection.
     */
    @JsonProperty(value = "properties.ipsecPolicies")
    private List<IpsecPolicy> ipsecPolicies;

    /*
     * The resource GUID property of the VirtualNetworkGatewayConnection
     * resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /*
     * The provisioning state of the VirtualNetworkGatewayConnection resource.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Bypass ExpressRoute Gateway for data forwarding.
     */
    @JsonProperty(value = "properties.expressRouteGatewayBypass")
    private Boolean expressRouteGatewayBypass;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: Gets a unique read-only string that changes
     * whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Gets a unique read-only string that changes
     * whenever the resource is updated.
     * 
     * @param etag the etag value to set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the authorizationKey property: The authorizationKey.
     * 
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey property: The authorizationKey.
     * 
     * @param authorizationKey the authorizationKey value to set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the virtualNetworkGateway1 property: A common class for general
     * resource information.
     * 
     * @return the virtualNetworkGateway1 value.
     */
    public VirtualNetworkGatewayInner virtualNetworkGateway1() {
        return this.virtualNetworkGateway1;
    }

    /**
     * Set the virtualNetworkGateway1 property: A common class for general
     * resource information.
     * 
     * @param virtualNetworkGateway1 the virtualNetworkGateway1 value to set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withVirtualNetworkGateway1(VirtualNetworkGatewayInner virtualNetworkGateway1) {
        this.virtualNetworkGateway1 = virtualNetworkGateway1;
        return this;
    }

    /**
     * Get the virtualNetworkGateway2 property: A common class for general
     * resource information.
     * 
     * @return the virtualNetworkGateway2 value.
     */
    public VirtualNetworkGatewayInner virtualNetworkGateway2() {
        return this.virtualNetworkGateway2;
    }

    /**
     * Set the virtualNetworkGateway2 property: A common class for general
     * resource information.
     * 
     * @param virtualNetworkGateway2 the virtualNetworkGateway2 value to set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withVirtualNetworkGateway2(VirtualNetworkGatewayInner virtualNetworkGateway2) {
        this.virtualNetworkGateway2 = virtualNetworkGateway2;
        return this;
    }

    /**
     * Get the localNetworkGateway2 property: A common class for general
     * resource information.
     * 
     * @return the localNetworkGateway2 value.
     */
    public LocalNetworkGatewayInner localNetworkGateway2() {
        return this.localNetworkGateway2;
    }

    /**
     * Set the localNetworkGateway2 property: A common class for general
     * resource information.
     * 
     * @param localNetworkGateway2 the localNetworkGateway2 value to set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withLocalNetworkGateway2(LocalNetworkGatewayInner localNetworkGateway2) {
        this.localNetworkGateway2 = localNetworkGateway2;
        return this;
    }

    /**
     * Get the connectionType property: Gateway connection type.
     * 
     * @return the connectionType value.
     */
    public VirtualNetworkGatewayConnectionType connectionType() {
        return this.connectionType;
    }

    /**
     * Set the connectionType property: Gateway connection type.
     * 
     * @param connectionType the connectionType value to set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withConnectionType(VirtualNetworkGatewayConnectionType connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Get the connectionProtocol property: Gateway connection protocol.
     * 
     * @return the connectionProtocol value.
     */
    public VirtualNetworkGatewayConnectionProtocol connectionProtocol() {
        return this.connectionProtocol;
    }

    /**
     * Set the connectionProtocol property: Gateway connection protocol.
     * 
     * @param connectionProtocol the connectionProtocol value to set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withConnectionProtocol(VirtualNetworkGatewayConnectionProtocol connectionProtocol) {
        this.connectionProtocol = connectionProtocol;
        return this;
    }

    /**
     * Get the routingWeight property: The routing weight.
     * 
     * @return the routingWeight value.
     */
    public Integer routingWeight() {
        return this.routingWeight;
    }

    /**
     * Set the routingWeight property: The routing weight.
     * 
     * @param routingWeight the routingWeight value to set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withRoutingWeight(Integer routingWeight) {
        this.routingWeight = routingWeight;
        return this;
    }

    /**
     * Get the sharedKey property: The IPSec shared key.
     * 
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey property: The IPSec shared key.
     * 
     * @param sharedKey the sharedKey value to set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get the connectionStatus property: Virtual Network Gateway connection
     * status.
     * 
     * @return the connectionStatus value.
     */
    public VirtualNetworkGatewayConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get the tunnelConnectionStatus property: Collection of all tunnels'
     * connection health status.
     * 
     * @return the tunnelConnectionStatus value.
     */
    public List<TunnelConnectionHealth> tunnelConnectionStatus() {
        return this.tunnelConnectionStatus;
    }

    /**
     * Get the egressBytesTransferred property: The egress bytes transferred in
     * this connection.
     * 
     * @return the egressBytesTransferred value.
     */
    public Long egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * Get the ingressBytesTransferred property: The ingress bytes transferred
     * in this connection.
     * 
     * @return the ingressBytesTransferred value.
     */
    public Long ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * Get the peer property: Reference to another subresource.
     * 
     * @return the peer value.
     */
    public SubResource peer() {
        return this.peer;
    }

    /**
     * Set the peer property: Reference to another subresource.
     * 
     * @param peer the peer value to set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withPeer(SubResource peer) {
        this.peer = peer;
        return this;
    }

    /**
     * Get the enableBgp property: EnableBgp flag.
     * 
     * @return the enableBgp value.
     */
    public Boolean enableBgp() {
        return this.enableBgp;
    }

    /**
     * Set the enableBgp property: EnableBgp flag.
     * 
     * @param enableBgp the enableBgp value to set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }

    /**
     * Get the usePolicyBasedTrafficSelectors property: Enable policy-based
     * traffic selectors.
     * 
     * @return the usePolicyBasedTrafficSelectors value.
     */
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors;
    }

    /**
     * Set the usePolicyBasedTrafficSelectors property: Enable policy-based
     * traffic selectors.
     * 
     * @param usePolicyBasedTrafficSelectors the usePolicyBasedTrafficSelectors
     * value to set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withUsePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors) {
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        return this;
    }

    /**
     * Get the ipsecPolicies property: The IPSec Policies to be considered by
     * this connection.
     * 
     * @return the ipsecPolicies value.
     */
    public List<IpsecPolicy> ipsecPolicies() {
        return this.ipsecPolicies;
    }

    /**
     * Set the ipsecPolicies property: The IPSec Policies to be considered by
     * this connection.
     * 
     * @param ipsecPolicies the ipsecPolicies value to set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        this.ipsecPolicies = ipsecPolicies;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the
     * VirtualNetworkGatewayConnection resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid property: The resource GUID property of the
     * VirtualNetworkGatewayConnection resource.
     * 
     * @param resourceGuid the resourceGuid value to set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the
     * VirtualNetworkGatewayConnection resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the expressRouteGatewayBypass property: Bypass ExpressRoute Gateway
     * for data forwarding.
     * 
     * @return the expressRouteGatewayBypass value.
     */
    public Boolean expressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass;
    }

    /**
     * Set the expressRouteGatewayBypass property: Bypass ExpressRoute Gateway
     * for data forwarding.
     * 
     * @param expressRouteGatewayBypass the expressRouteGatewayBypass value to
     * set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withExpressRouteGatewayBypass(Boolean expressRouteGatewayBypass) {
        this.expressRouteGatewayBypass = expressRouteGatewayBypass;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the VirtualNetworkGatewayConnectionInner object itself.
     */
    public VirtualNetworkGatewayConnectionInner withId(String id) {
        this.id = id;
        return this;
    }
}
