// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

/**
 * Samples for Devices Delete.
 */
public final class DevicesDeleteSamples {
    /*
     * x-ms-original-file: specification/databoxedge/resource-manager/Microsoft.DataBoxEdge/stable/2019-08-01/examples/
     * DataBoxEdgeDeviceDelete.json
     */
    /**
     * Sample code: DataBoxEdgeDeviceDelete.
     * 
     * @param manager Entry point to DataBoxEdgeManager.
     */
    public static void dataBoxEdgeDeviceDelete(com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager) {
        manager.devices().delete("GroupForEdgeAutomation", "testedgedevice", com.azure.core.util.Context.NONE);
    }
}
