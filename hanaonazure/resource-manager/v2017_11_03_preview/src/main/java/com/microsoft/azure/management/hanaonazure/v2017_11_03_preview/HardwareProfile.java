/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the hardware settings for the HANA instance.
 */
public class HardwareProfile {
    /**
     * Name of the hardware type (vendor and/or their product name). Possible
     * values include: 'Cisco_UCS', 'HPE'.
     */
    @JsonProperty(value = "hardwareType", access = JsonProperty.Access.WRITE_ONLY)
    private HanaHardwareTypeNamesEnum hardwareType;

    /**
     * Specifies the HANA instance SKU. Possible values include: 'S72m',
     * 'S144m', 'S72', 'S144', 'S192', 'S192m', 'S192xm', 'S96', 'S384',
     * 'S384m', 'S384xm', 'S384xxm', 'S576m', 'S576xm', 'S768', 'S768m',
     * 'S768xm', 'S960m'.
     */
    @JsonProperty(value = "hanaInstanceSize", access = JsonProperty.Access.WRITE_ONLY)
    private HanaInstanceSizeNamesEnum hanaInstanceSize;

    /**
     * Get name of the hardware type (vendor and/or their product name). Possible values include: 'Cisco_UCS', 'HPE'.
     *
     * @return the hardwareType value
     */
    public HanaHardwareTypeNamesEnum hardwareType() {
        return this.hardwareType;
    }

    /**
     * Get specifies the HANA instance SKU. Possible values include: 'S72m', 'S144m', 'S72', 'S144', 'S192', 'S192m', 'S192xm', 'S96', 'S384', 'S384m', 'S384xm', 'S384xxm', 'S576m', 'S576xm', 'S768', 'S768m', 'S768xm', 'S960m'.
     *
     * @return the hanaInstanceSize value
     */
    public HanaInstanceSizeNamesEnum hanaInstanceSize() {
        return this.hanaInstanceSize;
    }

}
