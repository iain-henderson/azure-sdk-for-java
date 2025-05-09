// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of VmwareCollectorsOperations.
 */
public interface VmwareCollectorsOperations {
    /**
     * List VmwareCollector resources by AssessmentProject.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName Assessment Project Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VmwareCollector list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VmwareCollector> listByAssessmentProject(String resourceGroupName, String projectName);

    /**
     * List VmwareCollector resources by AssessmentProject.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName Assessment Project Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VmwareCollector list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VmwareCollector> listByAssessmentProject(String resourceGroupName, String projectName,
        Context context);

    /**
     * Get a VmwareCollector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName Assessment Project Name.
     * @param vmWareCollectorName VMware collector ARM name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a VmwareCollector along with {@link Response}.
     */
    Response<VmwareCollector> getWithResponse(String resourceGroupName, String projectName, String vmWareCollectorName,
        Context context);

    /**
     * Get a VmwareCollector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName Assessment Project Name.
     * @param vmWareCollectorName VMware collector ARM name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a VmwareCollector.
     */
    VmwareCollector get(String resourceGroupName, String projectName, String vmWareCollectorName);

    /**
     * Delete a VmwareCollector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName Assessment Project Name.
     * @param vmWareCollectorName VMware collector ARM name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String projectName, String vmWareCollectorName,
        Context context);

    /**
     * Delete a VmwareCollector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName Assessment Project Name.
     * @param vmWareCollectorName VMware collector ARM name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String projectName, String vmWareCollectorName);

    /**
     * Get a VmwareCollector.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a VmwareCollector along with {@link Response}.
     */
    VmwareCollector getById(String id);

    /**
     * Get a VmwareCollector.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a VmwareCollector along with {@link Response}.
     */
    Response<VmwareCollector> getByIdWithResponse(String id, Context context);

    /**
     * Delete a VmwareCollector.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a VmwareCollector.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VmwareCollector resource.
     * 
     * @param name resource name.
     * @return the first stage of the new VmwareCollector definition.
     */
    VmwareCollector.DefinitionStages.Blank define(String name);
}
