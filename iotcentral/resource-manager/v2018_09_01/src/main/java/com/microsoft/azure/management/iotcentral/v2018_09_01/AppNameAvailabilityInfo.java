/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2018_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iotcentral.v2018_09_01.implementation.IoTCentralManager;
import com.microsoft.azure.management.iotcentral.v2018_09_01.implementation.AppNameAvailabilityInfoInner;

/**
 * Type representing AppNameAvailabilityInfo.
 */
public interface AppNameAvailabilityInfo extends HasInner<AppNameAvailabilityInfoInner>, HasManager<IoTCentralManager> {
    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * @return the reason value.
     */
    AppNameUnavailabilityReason reason();

}
