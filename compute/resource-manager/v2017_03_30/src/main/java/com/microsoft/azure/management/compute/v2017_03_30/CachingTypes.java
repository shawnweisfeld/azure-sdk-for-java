/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for CachingTypes.
 */
public enum CachingTypes {
    /** Enum value None. */
    NONE("None"),

    /** Enum value ReadOnly. */
    READ_ONLY("ReadOnly"),

    /** Enum value ReadWrite. */
    READ_WRITE("ReadWrite");

    /** The actual serialized value for a CachingTypes instance. */
    private String value;

    CachingTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CachingTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CachingTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static CachingTypes fromString(String value) {
        CachingTypes[] items = CachingTypes.values();
        for (CachingTypes item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
