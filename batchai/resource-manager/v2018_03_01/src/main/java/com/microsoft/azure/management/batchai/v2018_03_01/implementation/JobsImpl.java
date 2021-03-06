/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.batchai.v2018_03_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.batchai.v2018_03_01.Jobs;
import com.microsoft.azure.management.batchai.v2018_03_01.Job;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.batchai.v2018_03_01.RemoteLoginInformation;
import com.microsoft.azure.management.batchai.v2018_03_01.File;
import com.microsoft.azure.management.batchai.v2018_03_01.JobsListOutputFilesOptions;

class JobsImpl extends GroupableResourcesCoreImpl<Job, JobImpl, JobInner, JobsInner, BatchAIManager>  implements Jobs {
    protected JobsImpl(BatchAIManager manager) {
        super(manager.inner().jobs(), manager);
    }

    @Override
    protected Observable<JobInner> getInnerAsync(String resourceGroupName, String name) {
        JobsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        JobsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<Job> listByResourceGroup(String resourceGroupName) {
        JobsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    private Observable<Page<JobInner>> listByResourceGroupNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        JobsInner client = this.inner();
        return client.listByResourceGroupNextAsync(nextLink)
        .flatMap(new Func1<Page<JobInner>, Observable<Page<JobInner>>>() {
            @Override
            public Observable<Page<JobInner>> call(Page<JobInner> page) {
                return Observable.just(page).concatWith(listByResourceGroupNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<Job> listByResourceGroupAsync(String resourceGroupName) {
        JobsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<JobInner>, Observable<Page<JobInner>>>() {
            @Override
            public Observable<Page<JobInner>> call(Page<JobInner> page) {
                return listByResourceGroupNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<JobInner>, Iterable<JobInner>>() {
            @Override
            public Iterable<JobInner> call(Page<JobInner> page) {
                return page.items();
            }
       })
        .map(new Func1<JobInner, Job>() {
            @Override
            public Job call(JobInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public PagedList<Job> list() {
        JobsInner client = this.inner();
        return this.wrapList(client.list());
    }

    private Observable<Page<JobInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        JobsInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<JobInner>, Observable<Page<JobInner>>>() {
            @Override
            public Observable<Page<JobInner>> call(Page<JobInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<Job> listAsync() {
        JobsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<JobInner>, Observable<Page<JobInner>>>() {
            @Override
            public Observable<Page<JobInner>> call(Page<JobInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<JobInner>, Iterable<JobInner>>() {
            @Override
            public Iterable<JobInner> call(Page<JobInner> page) {
                return page.items();
            }
       })
        .map(new Func1<JobInner, Job>() {
            @Override
            public Job call(JobInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public JobImpl define(String name) {
        return wrapModel(name);
    }

    private Observable<Page<RemoteLoginInformationInner>> listRemoteLoginInformationNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        JobsInner client = this.inner();
        return client.listRemoteLoginInformationNextAsync(nextLink)
        .flatMap(new Func1<Page<RemoteLoginInformationInner>, Observable<Page<RemoteLoginInformationInner>>>() {
            @Override
            public Observable<Page<RemoteLoginInformationInner>> call(Page<RemoteLoginInformationInner> page) {
                return Observable.just(page).concatWith(listRemoteLoginInformationNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<RemoteLoginInformation> listRemoteLoginInformationAsync(final String resourceGroupName, final String jobName) {
        JobsInner client = this.inner();
        return client.listRemoteLoginInformationAsync(resourceGroupName, jobName)
        .flatMap(new Func1<Page<RemoteLoginInformationInner>, Observable<Page<RemoteLoginInformationInner>>>() {
            @Override
            public Observable<Page<RemoteLoginInformationInner>> call(Page<RemoteLoginInformationInner> page) {
                return listRemoteLoginInformationNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<RemoteLoginInformationInner>, Iterable<RemoteLoginInformationInner>>() {
            @Override
            public Iterable<RemoteLoginInformationInner> call(Page<RemoteLoginInformationInner> page) {
                return page.items();
            }
       })
        .map(new Func1<RemoteLoginInformationInner, RemoteLoginInformation>() {
            @Override
            public RemoteLoginInformation call(RemoteLoginInformationInner inner) {
                return new RemoteLoginInformationImpl(inner, manager());
            }
       });
    }

    @Override
    public Completable terminateAsync(String resourceGroupName, String jobName) {
        JobsInner client = this.inner();
        return client.terminateAsync(resourceGroupName, jobName).toCompletable();
    }

    private Observable<Page<FileInner>> listOutputFilesNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        JobsInner client = this.inner();
        return client.listOutputFilesNextAsync(nextLink)
        .flatMap(new Func1<Page<FileInner>, Observable<Page<FileInner>>>() {
            @Override
            public Observable<Page<FileInner>> call(Page<FileInner> page) {
                return Observable.just(page).concatWith(listOutputFilesNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<File> listOutputFilesAsync(final String resourceGroupName, final String jobName, final JobsListOutputFilesOptions jobsListOutputFilesOptions) {
        JobsInner client = this.inner();
        return client.listOutputFilesAsync(resourceGroupName, jobName, jobsListOutputFilesOptions)
        .flatMap(new Func1<Page<FileInner>, Observable<Page<FileInner>>>() {
            @Override
            public Observable<Page<FileInner>> call(Page<FileInner> page) {
                return listOutputFilesNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<FileInner>, Iterable<FileInner>>() {
            @Override
            public Iterable<FileInner> call(Page<FileInner> page) {
                return page.items();
            }
       })
        .map(new Func1<FileInner, File>() {
            @Override
            public File call(FileInner inner) {
                return new FileImpl(inner, manager());
            }
       });
    }

    @Override
    protected JobImpl wrapModel(JobInner inner) {
        return  new JobImpl(inner.name(), inner, manager());
    }

    @Override
    protected JobImpl wrapModel(String name) {
        return new JobImpl(name, new JobInner(), this.manager());
    }

}
