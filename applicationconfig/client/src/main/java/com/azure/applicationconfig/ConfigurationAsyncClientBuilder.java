// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.applicationconfig;

import com.azure.applicationconfig.credentials.ConfigurationClientCredentials;
import com.azure.applicationconfig.models.ConfigurationSetting;
import com.azure.applicationconfig.policy.ConfigurationCredentialsPolicy;
import com.azure.common.http.HttpClient;
import com.azure.common.http.HttpHeaders;
import com.azure.common.http.HttpPipeline;
import com.azure.common.http.policy.AddDatePolicy;
import com.azure.common.http.policy.AddHeadersPolicy;
import com.azure.common.http.policy.AsyncCredentialsPolicy;
import com.azure.common.http.policy.HttpLogDetailLevel;
import com.azure.common.http.policy.HttpLoggingPolicy;
import com.azure.common.http.policy.HttpPipelinePolicy;
import com.azure.common.http.policy.RequestIdPolicy;
import com.azure.common.http.policy.RetryPolicy;
import com.azure.common.http.policy.UserAgentPolicy;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Provides configuration options for instances of {@link ConfigurationAsyncClient}.
 *
 * @see ConfigurationAsyncClient
 * @see ConfigurationClientCredentials
 */
public final class ConfigurationAsyncClientBuilder {
    // This header tells the server to return the request id in the HTTP response. Useful for correlation with what
    // request was sent.
    private static final String ECHO_REQUEST_ID_HEADER = "x-ms-return-client-request-id";
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String CONTENT_TYPE_HEADER_VALUE = "application/json";
    private static final String ACCEPT_HEADER = "Accept";
    private static final String ACCEPT_HEADER_VALUE = "application/vnd.microsoft.azconfig.kv+json";

    private final List<HttpPipelinePolicy> policies;
    private final HttpHeaders headers;

    private ConfigurationClientCredentials credentials;
    private URL serviceEndpoint;
    private HttpClient httpClient;
    private HttpLogDetailLevel httpLogDetailLevel;
    private HttpPipeline pipeline;
    private RetryPolicy retryPolicy;

    ConfigurationAsyncClientBuilder() {
        retryPolicy = new RetryPolicy();
        httpLogDetailLevel = HttpLogDetailLevel.NONE;
        policies = new ArrayList<>();

        headers = new HttpHeaders();
        headers.set(ECHO_REQUEST_ID_HEADER, "true");
        headers.set(CONTENT_TYPE_HEADER, CONTENT_TYPE_HEADER_VALUE);
        headers.set(ACCEPT_HEADER, ACCEPT_HEADER_VALUE);
    }

    /**
     * Creates a {@link ConfigurationAsyncClient} based on options set in the Builder. Every time {@code build()} is
     * called, a new instance of {@link ConfigurationAsyncClient} is created.
     *
     * <p>
     * If {@link ConfigurationAsyncClientBuilder#pipeline(HttpPipeline) pipeline} is set, then the {@code pipeline} and
     * {@link ConfigurationAsyncClientBuilder#serviceEndpoint(String) serviceEndpoint} are used to create the
     * {@link ConfigurationAsyncClient client}. All other builder settings are ignored.
     * </p>
     *
     * @return A ConfigurationAsyncClient with the options set from the builder.
     * @throws NullPointerException If {@code serviceEndpoint} has not been set. This setting is automatically set when
     * {@link ConfigurationAsyncClientBuilder#credentials(ConfigurationClientCredentials) credentials} are set through
     * the builder. Or can be set explicitly by calling {@link ConfigurationAsyncClientBuilder#serviceEndpoint(String)}.
     * @throws IllegalStateException If {@link ConfigurationAsyncClientBuilder#credentials(ConfigurationClientCredentials)}
     * has not been set.
     */
    public ConfigurationAsyncClient build() {
        Objects.requireNonNull(serviceEndpoint);

        if (pipeline != null) {
            return new ConfigurationAsyncClient(serviceEndpoint, pipeline);
        }

        if (credentials == null) {
            throw new IllegalStateException("'credentials' is required.");
        }

        // Closest to API goes first, closest to wire goes last.
        final List<HttpPipelinePolicy> policies = new ArrayList<>();

        policies.add(new UserAgentPolicy(AzureConfiguration.NAME, AzureConfiguration.VERSION));
        policies.add(new RequestIdPolicy());
        policies.add(new AddHeadersPolicy(headers));
        policies.add(new AddDatePolicy());
        policies.add(new ConfigurationCredentialsPolicy());
        policies.add(new AsyncCredentialsPolicy(credentials));
        policies.add(retryPolicy);

        policies.addAll(this.policies);

        policies.add(new HttpLoggingPolicy(httpLogDetailLevel));

        HttpPipeline pipeline = httpClient == null
            ? new HttpPipeline(policies)
            : new HttpPipeline(httpClient, policies);

        return new ConfigurationAsyncClient(serviceEndpoint, pipeline);
    }

    /**
     * Sets the service endpoint for the Azure App Configuration instance.
     *
     * @param serviceEndpoint The URL of the Azure App Configuration instance to send {@link ConfigurationSetting}
     * service requests to and receive responses from.
     * @return The updated ConfigurationAsyncClientBuilder object.
     * @throws MalformedURLException if {@code serviceEndpoint} is null or it cannot be parsed into a valid URL.
     */
    public ConfigurationAsyncClientBuilder serviceEndpoint(String serviceEndpoint) throws MalformedURLException {
        this.serviceEndpoint = new URL(serviceEndpoint);
        return this;
    }

    /**
     * Sets the credentials to use when authenticating HTTP requests. Also, sets the
     * {@link ConfigurationAsyncClientBuilder#serviceEndpoint(String) serviceEndpoint} for this ConfigurationAsyncClientBuilder.
     *
     * @param credentials The credentials to use for authenticating HTTP requests.
     * @return The updated ConfigurationAsyncClientBuilder object.
     * @throws NullPointerException If {@code credentials} is {@code null}.
     */
    public ConfigurationAsyncClientBuilder credentials(ConfigurationClientCredentials credentials) {
        Objects.requireNonNull(credentials);
        this.credentials = credentials;
        this.serviceEndpoint = credentials.baseUri();
        return this;
    }

    /**
     * Sets the logging level for HTTP requests and responses.
     *
     * @param logLevel The amount of logging output when sending and receiving HTTP requests/responses.
     * @return The updated ConfigurationAsyncClientBuilder object.
     */
    public ConfigurationAsyncClientBuilder httpLogDetailLevel(HttpLogDetailLevel logLevel) {
        httpLogDetailLevel = logLevel;
        return this;
    }

    /**
     * Adds a policy to the set of existing policies that are executed after
     * {@link ConfigurationAsyncClient} required policies.
     *
     * @param policy The retry policy for service requests.
     * @return The updated ConfigurationAsyncClientBuilder object.
     * @throws NullPointerException If {@code policy} is {@code null}.
     */
    public ConfigurationAsyncClientBuilder addPolicy(HttpPipelinePolicy policy) {
        Objects.requireNonNull(policy);
        policies.add(policy);
        return this;
    }

    /**
     * Sets the HTTP client to use for sending and receiving requests to and from the service.
     *
     * @param client The HTTP client to use for requests.
     * @return The updated ConfigurationAsyncClientBuilder object.
     * @throws NullPointerException If {@code client} is {@code null}.
     */
    public ConfigurationAsyncClientBuilder httpClient(HttpClient client) {
        Objects.requireNonNull(client);
        this.httpClient = client;
        return this;
    }

    /**
     * Sets the HTTP pipeline to use for the service client.
     *
     * If {@code pipeline} is set, all other settings are ignored, aside from
     * {@link ConfigurationAsyncClientBuilder#serviceEndpoint(String) serviceEndpoint} to build {@link ConfigurationAsyncClient}.
     *
     * @param pipeline The HTTP pipeline to use for sending service requests and receiving responses.
     * @return The updated ConfigurationAsyncClientBuilder object.
     */
    public ConfigurationAsyncClientBuilder pipeline(HttpPipeline pipeline) {
        Objects.requireNonNull(pipeline);
        this.pipeline = pipeline;
        return this;
    }
}

