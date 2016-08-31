/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceCall;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in LocalNetworkGateways.
 */
public final class LocalNetworkGatewaysInner {
    /** The Retrofit service to perform REST calls. */
    private LocalNetworkGatewaysService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of LocalNetworkGatewaysInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LocalNetworkGatewaysInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(LocalNetworkGatewaysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for LocalNetworkGateways to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LocalNetworkGatewaysService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways/{localNetworkGatewayName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("localNetworkGatewayName") String localNetworkGatewayName, @Path("subscriptionId") String subscriptionId, @Body LocalNetworkGatewayInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways/{localNetworkGatewayName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("localNetworkGatewayName") String localNetworkGatewayName, @Path("subscriptionId") String subscriptionId, @Body LocalNetworkGatewayInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways/{localNetworkGatewayName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("localNetworkGatewayName") String localNetworkGatewayName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways/{localNetworkGatewayName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("localNetworkGatewayName") String localNetworkGatewayName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways/{localNetworkGatewayName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> beginDelete(@Path("resourceGroupName") String resourceGroupName, @Path("localNetworkGatewayName") String localNetworkGatewayName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("{nextLink}")
        Observable<Response<ResponseBody>> listNext(@Path(value = "nextLink", encoded = true) String nextPageLink, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * The Put LocalNetworkGateway operation creates/updates a local network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Local Network Gateway operation through Network resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the LocalNetworkGatewayInner object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<LocalNetworkGatewayInner> createOrUpdate(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        return createOrUpdateAsync(resourceGroupName, localNetworkGatewayName, parameters).toBlocking().last();
    }

    /**
     * The Put LocalNetworkGateway operation creates/updates a local network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Local Network Gateway operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<LocalNetworkGatewayInner> createOrUpdateAsync(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters, final ServiceCallback<LocalNetworkGatewayInner> serviceCallback) {
        return ServiceCall.create(createOrUpdateAsync(resourceGroupName, localNetworkGatewayName, parameters), serviceCallback);
    }

    /**
     * The Put LocalNetworkGateway operation creates/updates a local network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Local Network Gateway operation through Network resource provider.
     * @return the observable for the request
     */
    public Observable<ServiceResponse<LocalNetworkGatewayInner>> createOrUpdateAsync(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (localNetworkGatewayName == null) {
            throw new IllegalArgumentException("Parameter localNetworkGatewayName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(resourceGroupName, localNetworkGatewayName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<LocalNetworkGatewayInner>() { }.getType());
    }

    /**
     * The Put LocalNetworkGateway operation creates/updates a local network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Local Network Gateway operation through Network resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the LocalNetworkGatewayInner object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<LocalNetworkGatewayInner> beginCreateOrUpdate(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters) throws CloudException, IOException, IllegalArgumentException {
        return beginCreateOrUpdateAsync(resourceGroupName, localNetworkGatewayName, parameters).toBlocking().single();
    }

    /**
     * The Put LocalNetworkGateway operation creates/updates a local network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Local Network Gateway operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<LocalNetworkGatewayInner> beginCreateOrUpdateAsync(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters, final ServiceCallback<LocalNetworkGatewayInner> serviceCallback) {
        return ServiceCall.create(beginCreateOrUpdateAsync(resourceGroupName, localNetworkGatewayName, parameters), serviceCallback);
    }

    /**
     * The Put LocalNetworkGateway operation creates/updates a local network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Local Network Gateway operation through Network resource provider.
     * @return the observable to the LocalNetworkGatewayInner object
     */
    public Observable<ServiceResponse<LocalNetworkGatewayInner>> beginCreateOrUpdateAsync(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (localNetworkGatewayName == null) {
            throw new IllegalArgumentException("Parameter localNetworkGatewayName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.beginCreateOrUpdate(resourceGroupName, localNetworkGatewayName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LocalNetworkGatewayInner>>>() {
                @Override
                public Observable<ServiceResponse<LocalNetworkGatewayInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LocalNetworkGatewayInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LocalNetworkGatewayInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<LocalNetworkGatewayInner, CloudException>(this.client.mapperAdapter())
                .register(201, new TypeToken<LocalNetworkGatewayInner>() { }.getType())
                .register(200, new TypeToken<LocalNetworkGatewayInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The Get LocalNetworkGateway operation retrieves information about the specified local network gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the LocalNetworkGatewayInner object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<LocalNetworkGatewayInner> get(String resourceGroupName, String localNetworkGatewayName) throws CloudException, IOException, IllegalArgumentException {
        return getAsync(resourceGroupName, localNetworkGatewayName).toBlocking().single();
    }

    /**
     * The Get LocalNetworkGateway operation retrieves information about the specified local network gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<LocalNetworkGatewayInner> getAsync(String resourceGroupName, String localNetworkGatewayName, final ServiceCallback<LocalNetworkGatewayInner> serviceCallback) {
        return ServiceCall.create(getAsync(resourceGroupName, localNetworkGatewayName), serviceCallback);
    }

    /**
     * The Get LocalNetworkGateway operation retrieves information about the specified local network gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @return the observable to the LocalNetworkGatewayInner object
     */
    public Observable<ServiceResponse<LocalNetworkGatewayInner>> getAsync(String resourceGroupName, String localNetworkGatewayName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (localNetworkGatewayName == null) {
            throw new IllegalArgumentException("Parameter localNetworkGatewayName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, localNetworkGatewayName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LocalNetworkGatewayInner>>>() {
                @Override
                public Observable<ServiceResponse<LocalNetworkGatewayInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LocalNetworkGatewayInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LocalNetworkGatewayInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<LocalNetworkGatewayInner, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<LocalNetworkGatewayInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The Delete LocalNetworkGateway operation deletes the specified local network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> delete(String resourceGroupName, String localNetworkGatewayName) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        return deleteAsync(resourceGroupName, localNetworkGatewayName).toBlocking().last();
    }

    /**
     * The Delete LocalNetworkGateway operation deletes the specified local network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> deleteAsync(String resourceGroupName, String localNetworkGatewayName, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(deleteAsync(resourceGroupName, localNetworkGatewayName), serviceCallback);
    }

    /**
     * The Delete LocalNetworkGateway operation deletes the specified local network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> deleteAsync(String resourceGroupName, String localNetworkGatewayName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (localNetworkGatewayName == null) {
            throw new IllegalArgumentException("Parameter localNetworkGatewayName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Observable<Response<ResponseBody>> observable = service.delete(resourceGroupName, localNetworkGatewayName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * The Delete LocalNetworkGateway operation deletes the specified local network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> beginDelete(String resourceGroupName, String localNetworkGatewayName) throws CloudException, IOException, IllegalArgumentException {
        return beginDeleteAsync(resourceGroupName, localNetworkGatewayName).toBlocking().single();
    }

    /**
     * The Delete LocalNetworkGateway operation deletes the specified local network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> beginDeleteAsync(String resourceGroupName, String localNetworkGatewayName, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(beginDeleteAsync(resourceGroupName, localNetworkGatewayName), serviceCallback);
    }

    /**
     * The Delete LocalNetworkGateway operation deletes the specified local network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginDeleteAsync(String resourceGroupName, String localNetworkGatewayName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (localNetworkGatewayName == null) {
            throw new IllegalArgumentException("Parameter localNetworkGatewayName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.beginDelete(resourceGroupName, localNetworkGatewayName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = beginDeleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> beginDeleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.mapperAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * The List LocalNetworkGateways operation retrieves all the local network gateways stored.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;LocalNetworkGatewayInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PagedList<LocalNetworkGatewayInner>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException {
        ServiceResponse<Page<LocalNetworkGatewayInner>> response = listSinglePageAsync(resourceGroupName).toBlocking().single();
        PagedList<LocalNetworkGatewayInner> pagedList = new PagedList<LocalNetworkGatewayInner>(response.getBody()) {
            @Override
            public Page<LocalNetworkGatewayInner> nextPage(String nextPageLink) throws RestException, IOException {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
        return new ServiceResponse<PagedList<LocalNetworkGatewayInner>>(pagedList, response.getResponse());
    }

    /**
     * The List LocalNetworkGateways operation retrieves all the local network gateways stored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<LocalNetworkGatewayInner>> listAsync(final String resourceGroupName, final ListOperationCallback<LocalNetworkGatewayInner> serviceCallback) {
        return AzureServiceCall.create(
            listSinglePageAsync(resourceGroupName),
            new Func1<String, Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * The List LocalNetworkGateways operation retrieves all the local network gateways stored.
     *
     * @param resourceGroupName The name of the resource group.
     * @return the observable to the List&lt;LocalNetworkGatewayInner&gt; object
     */
    public Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>> listAsync(final String resourceGroupName) {
        return listSinglePageAsync(resourceGroupName)
            .concatMap(new Func1<ServiceResponse<Page<LocalNetworkGatewayInner>>, Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>> call(ServiceResponse<Page<LocalNetworkGatewayInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    return listNextSinglePageAsync(nextPageLink);
                }
            });
    }

    /**
     * The List LocalNetworkGateways operation retrieves all the local network gateways stored.
     *
    ServiceResponse<PageImpl<LocalNetworkGatewayInner>> * @param resourceGroupName The name of the resource group.
     * @return the List&lt;LocalNetworkGatewayInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>> listSinglePageAsync(final String resourceGroupName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(resourceGroupName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<LocalNetworkGatewayInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<LocalNetworkGatewayInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<LocalNetworkGatewayInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<LocalNetworkGatewayInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl<LocalNetworkGatewayInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The List LocalNetworkGateways operation retrieves all the local network gateways stored.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;LocalNetworkGatewayInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PagedList<LocalNetworkGatewayInner>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        ServiceResponse<Page<LocalNetworkGatewayInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        PagedList<LocalNetworkGatewayInner> pagedList = new PagedList<LocalNetworkGatewayInner>(response.getBody()) {
            @Override
            public Page<LocalNetworkGatewayInner> nextPage(String nextPageLink) throws RestException, IOException {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
        return new ServiceResponse<PagedList<LocalNetworkGatewayInner>>(pagedList, response.getResponse());
    }

    /**
     * The List LocalNetworkGateways operation retrieves all the local network gateways stored.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<LocalNetworkGatewayInner>> listNextAsync(final String nextPageLink, final ServiceCall<List<LocalNetworkGatewayInner>> serviceCall, final ListOperationCallback<LocalNetworkGatewayInner> serviceCallback) {
        return AzureServiceCall.create(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * The List LocalNetworkGateways operation retrieves all the local network gateways stored.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the List&lt;LocalNetworkGatewayInner&gt; object
     */
    public Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>> listNextAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<LocalNetworkGatewayInner>>, Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>> call(ServiceResponse<Page<LocalNetworkGatewayInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    return listNextSinglePageAsync(nextPageLink);
                }
            });
    }

    /**
     * The List LocalNetworkGateways operation retrieves all the local network gateways stored.
     *
    ServiceResponse<PageImpl<LocalNetworkGatewayInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the List&lt;LocalNetworkGatewayInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        return service.listNext(nextPageLink, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LocalNetworkGatewayInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<LocalNetworkGatewayInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<LocalNetworkGatewayInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<LocalNetworkGatewayInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<LocalNetworkGatewayInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl<LocalNetworkGatewayInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
