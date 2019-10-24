/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_01_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.eventgrid.v2020_01_01_preview.implementation.EventTypeInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventgrid.v2020_01_01_preview.implementation.EventGridManager;

/**
 * Type representing EventType.
 */
public interface EventType extends HasInner<EventTypeInner>, HasManager<EventGridManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isInDefaultSet value.
     */
    Boolean isInDefaultSet();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the schemaUrl value.
     */
    String schemaUrl();

    /**
     * @return the type value.
     */
    String type();

}
