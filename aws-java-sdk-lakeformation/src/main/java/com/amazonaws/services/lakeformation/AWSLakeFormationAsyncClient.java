/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lakeformation;

import javax.annotation.Generated;

import com.amazonaws.services.lakeformation.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Lake Formation asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Lake Formation</fullname>
 * <p>
 * Defines the public endpoint for the AWS Lake Formation service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLakeFormationAsyncClient extends AWSLakeFormationClient implements AWSLakeFormationAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSLakeFormationAsyncClientBuilder asyncBuilder() {
        return AWSLakeFormationAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lake Formation using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSLakeFormationAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lake Formation using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSLakeFormationAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AddLFTagsToResourceResult> addLFTagsToResourceAsync(AddLFTagsToResourceRequest request) {

        return addLFTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddLFTagsToResourceResult> addLFTagsToResourceAsync(final AddLFTagsToResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddLFTagsToResourceRequest, AddLFTagsToResourceResult> asyncHandler) {
        final AddLFTagsToResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddLFTagsToResourceResult>() {
            @Override
            public AddLFTagsToResourceResult call() throws Exception {
                AddLFTagsToResourceResult result = null;

                try {
                    result = executeAddLFTagsToResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGrantPermissionsResult> batchGrantPermissionsAsync(BatchGrantPermissionsRequest request) {

        return batchGrantPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGrantPermissionsResult> batchGrantPermissionsAsync(final BatchGrantPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGrantPermissionsRequest, BatchGrantPermissionsResult> asyncHandler) {
        final BatchGrantPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGrantPermissionsResult>() {
            @Override
            public BatchGrantPermissionsResult call() throws Exception {
                BatchGrantPermissionsResult result = null;

                try {
                    result = executeBatchGrantPermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchRevokePermissionsResult> batchRevokePermissionsAsync(BatchRevokePermissionsRequest request) {

        return batchRevokePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchRevokePermissionsResult> batchRevokePermissionsAsync(final BatchRevokePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchRevokePermissionsRequest, BatchRevokePermissionsResult> asyncHandler) {
        final BatchRevokePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchRevokePermissionsResult>() {
            @Override
            public BatchRevokePermissionsResult call() throws Exception {
                BatchRevokePermissionsResult result = null;

                try {
                    result = executeBatchRevokePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateLFTagResult> createLFTagAsync(CreateLFTagRequest request) {

        return createLFTagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLFTagResult> createLFTagAsync(final CreateLFTagRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLFTagRequest, CreateLFTagResult> asyncHandler) {
        final CreateLFTagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLFTagResult>() {
            @Override
            public CreateLFTagResult call() throws Exception {
                CreateLFTagResult result = null;

                try {
                    result = executeCreateLFTag(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteLFTagResult> deleteLFTagAsync(DeleteLFTagRequest request) {

        return deleteLFTagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLFTagResult> deleteLFTagAsync(final DeleteLFTagRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLFTagRequest, DeleteLFTagResult> asyncHandler) {
        final DeleteLFTagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLFTagResult>() {
            @Override
            public DeleteLFTagResult call() throws Exception {
                DeleteLFTagResult result = null;

                try {
                    result = executeDeleteLFTag(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeregisterResourceResult> deregisterResourceAsync(DeregisterResourceRequest request) {

        return deregisterResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterResourceResult> deregisterResourceAsync(final DeregisterResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterResourceRequest, DeregisterResourceResult> asyncHandler) {
        final DeregisterResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterResourceResult>() {
            @Override
            public DeregisterResourceResult call() throws Exception {
                DeregisterResourceResult result = null;

                try {
                    result = executeDeregisterResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(DescribeResourceRequest request) {

        return describeResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(final DescribeResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeResourceRequest, DescribeResourceResult> asyncHandler) {
        final DescribeResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeResourceResult>() {
            @Override
            public DescribeResourceResult call() throws Exception {
                DescribeResourceResult result = null;

                try {
                    result = executeDescribeResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeSettingsResult> getDataLakeSettingsAsync(GetDataLakeSettingsRequest request) {

        return getDataLakeSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeSettingsResult> getDataLakeSettingsAsync(final GetDataLakeSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataLakeSettingsRequest, GetDataLakeSettingsResult> asyncHandler) {
        final GetDataLakeSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataLakeSettingsResult>() {
            @Override
            public GetDataLakeSettingsResult call() throws Exception {
                GetDataLakeSettingsResult result = null;

                try {
                    result = executeGetDataLakeSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEffectivePermissionsForPathResult> getEffectivePermissionsForPathAsync(GetEffectivePermissionsForPathRequest request) {

        return getEffectivePermissionsForPathAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEffectivePermissionsForPathResult> getEffectivePermissionsForPathAsync(
            final GetEffectivePermissionsForPathRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEffectivePermissionsForPathRequest, GetEffectivePermissionsForPathResult> asyncHandler) {
        final GetEffectivePermissionsForPathRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEffectivePermissionsForPathResult>() {
            @Override
            public GetEffectivePermissionsForPathResult call() throws Exception {
                GetEffectivePermissionsForPathResult result = null;

                try {
                    result = executeGetEffectivePermissionsForPath(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLFTagResult> getLFTagAsync(GetLFTagRequest request) {

        return getLFTagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLFTagResult> getLFTagAsync(final GetLFTagRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLFTagRequest, GetLFTagResult> asyncHandler) {
        final GetLFTagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLFTagResult>() {
            @Override
            public GetLFTagResult call() throws Exception {
                GetLFTagResult result = null;

                try {
                    result = executeGetLFTag(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResourceLFTagsResult> getResourceLFTagsAsync(GetResourceLFTagsRequest request) {

        return getResourceLFTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceLFTagsResult> getResourceLFTagsAsync(final GetResourceLFTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceLFTagsRequest, GetResourceLFTagsResult> asyncHandler) {
        final GetResourceLFTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceLFTagsResult>() {
            @Override
            public GetResourceLFTagsResult call() throws Exception {
                GetResourceLFTagsResult result = null;

                try {
                    result = executeGetResourceLFTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GrantPermissionsResult> grantPermissionsAsync(GrantPermissionsRequest request) {

        return grantPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GrantPermissionsResult> grantPermissionsAsync(final GrantPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GrantPermissionsRequest, GrantPermissionsResult> asyncHandler) {
        final GrantPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GrantPermissionsResult>() {
            @Override
            public GrantPermissionsResult call() throws Exception {
                GrantPermissionsResult result = null;

                try {
                    result = executeGrantPermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLFTagsResult> listLFTagsAsync(ListLFTagsRequest request) {

        return listLFTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLFTagsResult> listLFTagsAsync(final ListLFTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLFTagsRequest, ListLFTagsResult> asyncHandler) {
        final ListLFTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLFTagsResult>() {
            @Override
            public ListLFTagsResult call() throws Exception {
                ListLFTagsResult result = null;

                try {
                    result = executeListLFTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest request) {

        return listPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(final ListPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPermissionsRequest, ListPermissionsResult> asyncHandler) {
        final ListPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPermissionsResult>() {
            @Override
            public ListPermissionsResult call() throws Exception {
                ListPermissionsResult result = null;

                try {
                    result = executeListPermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest request) {

        return listResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(final ListResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler) {
        final ListResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourcesResult>() {
            @Override
            public ListResourcesResult call() throws Exception {
                ListResourcesResult result = null;

                try {
                    result = executeListResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutDataLakeSettingsResult> putDataLakeSettingsAsync(PutDataLakeSettingsRequest request) {

        return putDataLakeSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDataLakeSettingsResult> putDataLakeSettingsAsync(final PutDataLakeSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDataLakeSettingsRequest, PutDataLakeSettingsResult> asyncHandler) {
        final PutDataLakeSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDataLakeSettingsResult>() {
            @Override
            public PutDataLakeSettingsResult call() throws Exception {
                PutDataLakeSettingsResult result = null;

                try {
                    result = executePutDataLakeSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RegisterResourceResult> registerResourceAsync(RegisterResourceRequest request) {

        return registerResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterResourceResult> registerResourceAsync(final RegisterResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterResourceRequest, RegisterResourceResult> asyncHandler) {
        final RegisterResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterResourceResult>() {
            @Override
            public RegisterResourceResult call() throws Exception {
                RegisterResourceResult result = null;

                try {
                    result = executeRegisterResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveLFTagsFromResourceResult> removeLFTagsFromResourceAsync(RemoveLFTagsFromResourceRequest request) {

        return removeLFTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveLFTagsFromResourceResult> removeLFTagsFromResourceAsync(final RemoveLFTagsFromResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveLFTagsFromResourceRequest, RemoveLFTagsFromResourceResult> asyncHandler) {
        final RemoveLFTagsFromResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveLFTagsFromResourceResult>() {
            @Override
            public RemoveLFTagsFromResourceResult call() throws Exception {
                RemoveLFTagsFromResourceResult result = null;

                try {
                    result = executeRemoveLFTagsFromResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RevokePermissionsResult> revokePermissionsAsync(RevokePermissionsRequest request) {

        return revokePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokePermissionsResult> revokePermissionsAsync(final RevokePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokePermissionsRequest, RevokePermissionsResult> asyncHandler) {
        final RevokePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokePermissionsResult>() {
            @Override
            public RevokePermissionsResult call() throws Exception {
                RevokePermissionsResult result = null;

                try {
                    result = executeRevokePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchDatabasesByLFTagsResult> searchDatabasesByLFTagsAsync(SearchDatabasesByLFTagsRequest request) {

        return searchDatabasesByLFTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchDatabasesByLFTagsResult> searchDatabasesByLFTagsAsync(final SearchDatabasesByLFTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchDatabasesByLFTagsRequest, SearchDatabasesByLFTagsResult> asyncHandler) {
        final SearchDatabasesByLFTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchDatabasesByLFTagsResult>() {
            @Override
            public SearchDatabasesByLFTagsResult call() throws Exception {
                SearchDatabasesByLFTagsResult result = null;

                try {
                    result = executeSearchDatabasesByLFTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchTablesByLFTagsResult> searchTablesByLFTagsAsync(SearchTablesByLFTagsRequest request) {

        return searchTablesByLFTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchTablesByLFTagsResult> searchTablesByLFTagsAsync(final SearchTablesByLFTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchTablesByLFTagsRequest, SearchTablesByLFTagsResult> asyncHandler) {
        final SearchTablesByLFTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchTablesByLFTagsResult>() {
            @Override
            public SearchTablesByLFTagsResult call() throws Exception {
                SearchTablesByLFTagsResult result = null;

                try {
                    result = executeSearchTablesByLFTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateLFTagResult> updateLFTagAsync(UpdateLFTagRequest request) {

        return updateLFTagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLFTagResult> updateLFTagAsync(final UpdateLFTagRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLFTagRequest, UpdateLFTagResult> asyncHandler) {
        final UpdateLFTagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLFTagResult>() {
            @Override
            public UpdateLFTagResult call() throws Exception {
                UpdateLFTagResult result = null;

                try {
                    result = executeUpdateLFTag(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest request) {

        return updateResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(final UpdateResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler) {
        final UpdateResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResourceResult>() {
            @Override
            public UpdateResourceResult call() throws Exception {
                UpdateResourceResult result = null;

                try {
                    result = executeUpdateResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
