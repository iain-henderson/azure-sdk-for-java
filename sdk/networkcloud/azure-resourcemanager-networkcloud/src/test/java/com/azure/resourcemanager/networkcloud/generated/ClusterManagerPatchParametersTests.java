// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.ClusterManagerPatchParameters;
import com.azure.resourcemanager.networkcloud.models.ManagedServiceIdentity;
import com.azure.resourcemanager.networkcloud.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.networkcloud.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterManagerPatchParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterManagerPatchParameters model = BinaryData.fromString(
            "{\"identity\":{\"principalId\":\"c4295c82-9d6e-491d-a4ad-a457bc6954e7\",\"tenantId\":\"f28fd806-a4aa-4239-9d59-6501c3550fd8\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"lu\":{\"principalId\":\"ea4341fe-b3ba-4457-b096-5b2981bc77c7\",\"clientId\":\"a63d3fb5-d31e-4556-86d1-47c203e9b215\"},\"tangcfhnykzcu\":{\"principalId\":\"eccb7617-4b93-441d-bfa3-590faf3fda1d\",\"clientId\":\"09be1f40-d778-4b32-9b8d-cfc9904aaa31\"},\"vxwlmzqwmvtxnj\":{\"principalId\":\"ef2c8fa3-0ac6-4601-82a6-f633cfe68be2\",\"clientId\":\"fa10b3c9-1b4e-485c-8709-fd8c42facf4e\"}}},\"tags\":{\"pdkvg\":\"cuqudtcvclxy\",\"ibuz\":\"abuiy\",\"xgjiuqh\":\"hdugneiknpg\"}}")
            .toObject(ClusterManagerPatchParameters.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("cuqudtcvclxy", model.tags().get("pdkvg"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterManagerPatchParameters model = new ClusterManagerPatchParameters()
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                .withUserAssignedIdentities(mapOf("lu", new UserAssignedIdentity(), "tangcfhnykzcu",
                    new UserAssignedIdentity(), "vxwlmzqwmvtxnj", new UserAssignedIdentity())))
            .withTags(mapOf("pdkvg", "cuqudtcvclxy", "ibuz", "abuiy", "xgjiuqh", "hdugneiknpg"));
        model = BinaryData.fromObject(model).toObject(ClusterManagerPatchParameters.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("cuqudtcvclxy", model.tags().get("pdkvg"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
