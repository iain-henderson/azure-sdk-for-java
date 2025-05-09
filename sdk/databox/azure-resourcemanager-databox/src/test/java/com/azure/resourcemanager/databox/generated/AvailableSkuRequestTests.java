// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.AvailableSkuRequest;
import com.azure.resourcemanager.databox.models.SkuName;
import com.azure.resourcemanager.databox.models.TransferType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AvailableSkuRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailableSkuRequest model = BinaryData.fromString(
            "{\"transferType\":\"ExportFromAzure\",\"country\":\"c\",\"location\":\"r\",\"skuNames\":[\"DataBoxDisk\",\"DataBox\",\"DataBoxCustomerDisk\",\"DataBoxCustomerDisk\"]}")
            .toObject(AvailableSkuRequest.class);
        Assertions.assertEquals(TransferType.EXPORT_FROM_AZURE, model.transferType());
        Assertions.assertEquals("c", model.country());
        Assertions.assertEquals("r", model.location());
        Assertions.assertEquals(SkuName.DATA_BOX_DISK, model.skuNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailableSkuRequest model = new AvailableSkuRequest().withTransferType(TransferType.EXPORT_FROM_AZURE)
            .withCountry("c")
            .withLocation("r")
            .withSkuNames(Arrays.asList(SkuName.DATA_BOX_DISK, SkuName.DATA_BOX, SkuName.DATA_BOX_CUSTOMER_DISK,
                SkuName.DATA_BOX_CUSTOMER_DISK));
        model = BinaryData.fromObject(model).toObject(AvailableSkuRequest.class);
        Assertions.assertEquals(TransferType.EXPORT_FROM_AZURE, model.transferType());
        Assertions.assertEquals("c", model.country());
        Assertions.assertEquals("r", model.location());
        Assertions.assertEquals(SkuName.DATA_BOX_DISK, model.skuNames().get(0));
    }
}
