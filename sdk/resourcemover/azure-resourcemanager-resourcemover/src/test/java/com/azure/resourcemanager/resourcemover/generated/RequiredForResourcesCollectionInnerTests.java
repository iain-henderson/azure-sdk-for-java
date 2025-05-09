// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.fluent.models.RequiredForResourcesCollectionInner;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RequiredForResourcesCollectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RequiredForResourcesCollectionInner model = BinaryData.fromString("{\"sourceIds\":[\"oenkouknvudwti\"]}")
            .toObject(RequiredForResourcesCollectionInner.class);
        Assertions.assertEquals("oenkouknvudwti", model.sourceIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RequiredForResourcesCollectionInner model
            = new RequiredForResourcesCollectionInner().withSourceIds(Arrays.asList("oenkouknvudwti"));
        model = BinaryData.fromObject(model).toObject(RequiredForResourcesCollectionInner.class);
        Assertions.assertEquals("oenkouknvudwti", model.sourceIds().get(0));
    }
}
