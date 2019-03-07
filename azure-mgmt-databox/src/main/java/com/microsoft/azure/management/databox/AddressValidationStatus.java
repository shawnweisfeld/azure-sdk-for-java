/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AddressValidationStatus.
 */
public enum AddressValidationStatus {
    /** Address provided is valid. */
    VALID("Valid"),

    /** Address provided is invalid or not supported. */
    INVALID("Invalid"),

    /** Address provided is ambiguous, please choose one of the alternate addresses returned. */
    AMBIGUOUS("Ambiguous");

    /** The actual serialized value for a AddressValidationStatus instance. */
    private String value;

    AddressValidationStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AddressValidationStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AddressValidationStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static AddressValidationStatus fromString(String value) {
        AddressValidationStatus[] items = AddressValidationStatus.values();
        for (AddressValidationStatus item : items) {
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
