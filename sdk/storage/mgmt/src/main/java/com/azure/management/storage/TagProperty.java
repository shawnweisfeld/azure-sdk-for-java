// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The TagProperty model.
 */
@Immutable
public final class TagProperty {
    /*
     * The tag value.
     */
    @JsonProperty(value = "tag", access = JsonProperty.Access.WRITE_ONLY)
    private String tag;

    /*
     * Returns the date and time the tag was added.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timestamp;

    /*
     * Returns the Object ID of the user who added the tag.
     */
    @JsonProperty(value = "objectIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String objectIdentifier;

    /*
     * Returns the Tenant ID that issued the token for the user who added the
     * tag.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * Returns the User Principal Name of the user who added the tag.
     */
    @JsonProperty(value = "upn", access = JsonProperty.Access.WRITE_ONLY)
    private String upn;

    /**
     * Get the tag property: The tag value.
     * 
     * @return the tag value.
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Get the timestamp property: Returns the date and time the tag was added.
     * 
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get the objectIdentifier property: Returns the Object ID of the user who
     * added the tag.
     * 
     * @return the objectIdentifier value.
     */
    public String objectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * Get the tenantId property: Returns the Tenant ID that issued the token
     * for the user who added the tag.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the upn property: Returns the User Principal Name of the user who
     * added the tag.
     * 
     * @return the upn value.
     */
    public String upn() {
        return this.upn;
    }
}
