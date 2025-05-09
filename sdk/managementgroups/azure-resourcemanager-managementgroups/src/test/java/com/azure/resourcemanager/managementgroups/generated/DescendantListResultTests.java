// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managementgroups.fluent.models.DescendantInfoInner;
import com.azure.resourcemanager.managementgroups.models.DescendantListResult;
import com.azure.resourcemanager.managementgroups.models.DescendantParentGroupInfo;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DescendantListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DescendantListResult model = BinaryData.fromString(
            "{\"value\":[{\"id\":\"suyonobglaocq\",\"type\":\"ccm\",\"name\":\"udxytlmoyrx\",\"properties\":{\"displayName\":\"u\",\"parent\":{\"id\":\"zntxhdz\"}}}],\"nextLink\":\"rqjbhckfrl\"}")
            .toObject(DescendantListResult.class);
        Assertions.assertEquals("u", model.value().get(0).displayName());
        Assertions.assertEquals("zntxhdz", model.value().get(0).parent().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DescendantListResult model
            = new DescendantListResult().withValue(Arrays.asList(new DescendantInfoInner().withDisplayName("u")
                .withParent(new DescendantParentGroupInfo().withId("zntxhdz"))));
        model = BinaryData.fromObject(model).toObject(DescendantListResult.class);
        Assertions.assertEquals("u", model.value().get(0).displayName());
        Assertions.assertEquals("zntxhdz", model.value().get(0).parent().id());
    }
}
