// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.UsageResultInner;

public final class UsageResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UsageResultInner model = BinaryData.fromString(
            "{\"id\":\"xbezyiuokktwh\",\"name\":{\"value\":\"wz\",\"localizedValue\":\"q\"},\"properties\":{\"currentValue\":1170430043,\"limit\":950260289,\"unit\":\"xim\"}}")
            .toObject(UsageResultInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UsageResultInner model = new UsageResultInner();
        model = BinaryData.fromObject(model).toObject(UsageResultInner.class);
    }
}
