// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.databricks.fluent.models.AccessConnectorInner;
import com.azure.resourcemanager.databricks.models.AccessConnectorUpdate;

/**
 * An instance of this class provides access to all the operations defined in AccessConnectorsClient.
 */
public interface AccessConnectorsClient {
    /**
     * Gets an azure databricks accessConnector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectorName The name of the azure databricks accessConnector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an azure databricks accessConnector along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessConnectorInner> getByResourceGroupWithResponse(String resourceGroupName, String connectorName,
        Context context);

    /**
     * Gets an azure databricks accessConnector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectorName The name of the azure databricks accessConnector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an azure databricks accessConnector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessConnectorInner getByResourceGroup(String resourceGroupName, String connectorName);

    /**
     * Deletes the azure databricks accessConnector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectorName The name of the azure databricks accessConnector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String connectorName);

    /**
     * Deletes the azure databricks accessConnector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectorName The name of the azure databricks accessConnector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String connectorName, Context context);

    /**
     * Deletes the azure databricks accessConnector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectorName The name of the azure databricks accessConnector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String connectorName);

    /**
     * Deletes the azure databricks accessConnector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectorName The name of the azure databricks accessConnector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String connectorName, Context context);

    /**
     * Creates or updates azure databricks accessConnector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectorName The name of the azure databricks accessConnector.
     * @param parameters Parameters supplied to the create or update an azure databricks accessConnector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of information about azure databricks accessConnector.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AccessConnectorInner>, AccessConnectorInner> beginCreateOrUpdate(String resourceGroupName,
        String connectorName, AccessConnectorInner parameters);

    /**
     * Creates or updates azure databricks accessConnector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectorName The name of the azure databricks accessConnector.
     * @param parameters Parameters supplied to the create or update an azure databricks accessConnector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of information about azure databricks accessConnector.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AccessConnectorInner>, AccessConnectorInner> beginCreateOrUpdate(String resourceGroupName,
        String connectorName, AccessConnectorInner parameters, Context context);

    /**
     * Creates or updates azure databricks accessConnector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectorName The name of the azure databricks accessConnector.
     * @param parameters Parameters supplied to the create or update an azure databricks accessConnector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about azure databricks accessConnector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessConnectorInner createOrUpdate(String resourceGroupName, String connectorName,
        AccessConnectorInner parameters);

    /**
     * Creates or updates azure databricks accessConnector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectorName The name of the azure databricks accessConnector.
     * @param parameters Parameters supplied to the create or update an azure databricks accessConnector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about azure databricks accessConnector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessConnectorInner createOrUpdate(String resourceGroupName, String connectorName, AccessConnectorInner parameters,
        Context context);

    /**
     * Updates an azure databricks accessConnector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectorName The name of the azure databricks accessConnector.
     * @param parameters The update to the azure databricks accessConnector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of information about azure databricks accessConnector.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AccessConnectorInner>, AccessConnectorInner> beginUpdate(String resourceGroupName,
        String connectorName, AccessConnectorUpdate parameters);

    /**
     * Updates an azure databricks accessConnector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectorName The name of the azure databricks accessConnector.
     * @param parameters The update to the azure databricks accessConnector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of information about azure databricks accessConnector.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AccessConnectorInner>, AccessConnectorInner> beginUpdate(String resourceGroupName,
        String connectorName, AccessConnectorUpdate parameters, Context context);

    /**
     * Updates an azure databricks accessConnector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectorName The name of the azure databricks accessConnector.
     * @param parameters The update to the azure databricks accessConnector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about azure databricks accessConnector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessConnectorInner update(String resourceGroupName, String connectorName, AccessConnectorUpdate parameters);

    /**
     * Updates an azure databricks accessConnector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectorName The name of the azure databricks accessConnector.
     * @param parameters The update to the azure databricks accessConnector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about azure databricks accessConnector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessConnectorInner update(String resourceGroupName, String connectorName, AccessConnectorUpdate parameters,
        Context context);

    /**
     * Gets all the azure databricks accessConnectors within a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the azure databricks accessConnectors within a resource group as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccessConnectorInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the azure databricks accessConnectors within a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the azure databricks accessConnectors within a resource group as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccessConnectorInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all the azure databricks accessConnectors within a subscription.
     * 
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the azure databricks accessConnectors within a subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccessConnectorInner> list();

    /**
     * Gets all the azure databricks accessConnectors within a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the azure databricks accessConnectors within a subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccessConnectorInner> list(Context context);
}
