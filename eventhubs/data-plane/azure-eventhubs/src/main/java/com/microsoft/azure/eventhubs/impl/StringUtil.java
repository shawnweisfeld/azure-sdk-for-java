// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.eventhubs.impl;

import java.util.UUID;

public final class StringUtil {
    public static final String EMPTY = "";

    public static boolean isNullOrEmpty(String string) {
        return (string == null || string.isEmpty());
    }

    public static boolean isNullOrWhiteSpace(String string) {
        if (string == null) {
            return true;
        }
        for (int index = 0; index < string.length(); index++) {
            if (!Character.isWhitespace(string.charAt(index))) {
                return false;
            }
        }

        return true;
    }

    public static String getRandomString() {
        return UUID.randomUUID().toString().substring(0, 6);
    }
}
