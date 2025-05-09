// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ConsistencyCheckTaskDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InconsistentVmDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ConsistencyCheckTaskDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConsistencyCheckTaskDetails model = BinaryData.fromString(
            "{\"instanceType\":\"ConsistencyCheckTaskDetails\",\"vmDetails\":[{\"vmName\":\"kbudbtwaokb\",\"cloudName\":\"lyttaaknwfr\",\"details\":[\"sm\",\"p\",\"ujd\"],\"errorIds\":[\"toleksc\",\"ctnanqimwbzxp\",\"cldpkawn\"]}]}")
            .toObject(ConsistencyCheckTaskDetails.class);
        Assertions.assertEquals("kbudbtwaokb", model.vmDetails().get(0).vmName());
        Assertions.assertEquals("lyttaaknwfr", model.vmDetails().get(0).cloudName());
        Assertions.assertEquals("sm", model.vmDetails().get(0).details().get(0));
        Assertions.assertEquals("toleksc", model.vmDetails().get(0).errorIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConsistencyCheckTaskDetails model = new ConsistencyCheckTaskDetails()
            .withVmDetails(Arrays.asList(new InconsistentVmDetails().withVmName("kbudbtwaokb")
                .withCloudName("lyttaaknwfr")
                .withDetails(Arrays.asList("sm", "p", "ujd"))
                .withErrorIds(Arrays.asList("toleksc", "ctnanqimwbzxp", "cldpkawn"))));
        model = BinaryData.fromObject(model).toObject(ConsistencyCheckTaskDetails.class);
        Assertions.assertEquals("kbudbtwaokb", model.vmDetails().get(0).vmName());
        Assertions.assertEquals("lyttaaknwfr", model.vmDetails().get(0).cloudName());
        Assertions.assertEquals("sm", model.vmDetails().get(0).details().get(0));
        Assertions.assertEquals("toleksc", model.vmDetails().get(0).errorIds().get(0));
    }
}
