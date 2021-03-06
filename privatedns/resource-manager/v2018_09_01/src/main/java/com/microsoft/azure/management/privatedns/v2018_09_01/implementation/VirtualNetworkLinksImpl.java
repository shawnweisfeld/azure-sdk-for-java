/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.privatedns.v2018_09_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.privatedns.v2018_09_01.VirtualNetworkLinks;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.privatedns.v2018_09_01.VirtualNetworkLink;

class VirtualNetworkLinksImpl extends WrapperImpl<VirtualNetworkLinksInner> implements VirtualNetworkLinks {
    private final privatednsManager manager;

    VirtualNetworkLinksImpl(privatednsManager manager) {
        super(manager.inner().virtualNetworkLinks());
        this.manager = manager;
    }

    public privatednsManager manager() {
        return this.manager;
    }

    @Override
    public VirtualNetworkLinkImpl define(String name) {
        return wrapModel(name);
    }

    private VirtualNetworkLinkImpl wrapModel(VirtualNetworkLinkInner inner) {
        return  new VirtualNetworkLinkImpl(inner, manager());
    }

    private VirtualNetworkLinkImpl wrapModel(String name) {
        return new VirtualNetworkLinkImpl(name, this.manager());
    }

    @Override
    public Observable<VirtualNetworkLink> listAsync(final String resourceGroupName, final String privateZoneName) {
        VirtualNetworkLinksInner client = this.inner();
        return client.listAsync(resourceGroupName, privateZoneName)
        .flatMapIterable(new Func1<Page<VirtualNetworkLinkInner>, Iterable<VirtualNetworkLinkInner>>() {
            @Override
            public Iterable<VirtualNetworkLinkInner> call(Page<VirtualNetworkLinkInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualNetworkLinkInner, VirtualNetworkLink>() {
            @Override
            public VirtualNetworkLink call(VirtualNetworkLinkInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<VirtualNetworkLink> getAsync(String resourceGroupName, String privateZoneName, String virtualNetworkLinkName) {
        VirtualNetworkLinksInner client = this.inner();
        return client.getAsync(resourceGroupName, privateZoneName, virtualNetworkLinkName)
        .map(new Func1<VirtualNetworkLinkInner, VirtualNetworkLink>() {
            @Override
            public VirtualNetworkLink call(VirtualNetworkLinkInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String privateZoneName, String virtualNetworkLinkName) {
        VirtualNetworkLinksInner client = this.inner();
        return client.deleteAsync(resourceGroupName, privateZoneName, virtualNetworkLinkName).toCompletable();
    }

}
