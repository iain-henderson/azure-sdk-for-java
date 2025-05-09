// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of SecurityStandards.
 */
public interface SecurityStandards {
    /**
     * Get a list of all relevant security standards over a scope.
     * 
     * @param scope The scope of the security standard. Valid scopes are: management group (format:
     * 'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     * 'subscriptions/{subscriptionId}'), or security connector (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all relevant security standards over a scope as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityStandard> list(String scope);

    /**
     * Get a list of all relevant security standards over a scope.
     * 
     * @param scope The scope of the security standard. Valid scopes are: management group (format:
     * 'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     * 'subscriptions/{subscriptionId}'), or security connector (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all relevant security standards over a scope as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityStandard> list(String scope, Context context);

    /**
     * Get a specific security standard for the requested scope by standardId.
     * 
     * @param scope The scope of the security standard. Valid scopes are: management group (format:
     * 'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     * 'subscriptions/{subscriptionId}'), or security connector (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param standardId The Security Standard key - unique key for the standard type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific security standard for the requested scope by standardId along with {@link Response}.
     */
    Response<SecurityStandard> getWithResponse(String scope, String standardId, Context context);

    /**
     * Get a specific security standard for the requested scope by standardId.
     * 
     * @param scope The scope of the security standard. Valid scopes are: management group (format:
     * 'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     * 'subscriptions/{subscriptionId}'), or security connector (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param standardId The Security Standard key - unique key for the standard type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific security standard for the requested scope by standardId.
     */
    SecurityStandard get(String scope, String standardId);

    /**
     * Delete a security standard over a given scope.
     * 
     * @param scope The scope of the security standard. Valid scopes are: management group (format:
     * 'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     * 'subscriptions/{subscriptionId}'), or security connector (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param standardId The Security Standard key - unique key for the standard type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String scope, String standardId, Context context);

    /**
     * Delete a security standard over a given scope.
     * 
     * @param scope The scope of the security standard. Valid scopes are: management group (format:
     * 'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     * 'subscriptions/{subscriptionId}'), or security connector (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param standardId The Security Standard key - unique key for the standard type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String scope, String standardId);

    /**
     * Get a specific security standard for the requested scope by standardId.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific security standard for the requested scope by standardId along with {@link Response}.
     */
    SecurityStandard getById(String id);

    /**
     * Get a specific security standard for the requested scope by standardId.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific security standard for the requested scope by standardId along with {@link Response}.
     */
    Response<SecurityStandard> getByIdWithResponse(String id, Context context);

    /**
     * Delete a security standard over a given scope.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a security standard over a given scope.
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
     * Begins definition for a new SecurityStandard resource.
     * 
     * @param name resource name.
     * @return the first stage of the new SecurityStandard definition.
     */
    SecurityStandard.DefinitionStages.Blank define(String name);
}
