/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * <p>
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.queue.models;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.http.HttpRequest;

import java.util.Map;

/**
 * Contains all response data for the setProperties operation.
 */
public final class ServiceSetPropertiesResponse extends RestResponse<ServiceSetPropertiesHeaders, Void> {
    /**
     * Creates an instance of ServiceSetPropertiesResponse.
     *
     * @param request
     *         the request which resulted in this {response.Name}.
     * @param statusCode
     *         the status code of the HTTP response.
     * @param headers
     *         the deserialized headers of the HTTP response.
     * @param rawHeaders
     *         the raw headers of the HTTP response.
     * @param body
     *         the deserialized body of the HTTP response.
     */
    public ServiceSetPropertiesResponse(HttpRequest request, int statusCode, ServiceSetPropertiesHeaders headers, Map<String, String> rawHeaders, Void body) {
        super(request, statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public ServiceSetPropertiesHeaders headers() {
        return super.headers();
    }
}
