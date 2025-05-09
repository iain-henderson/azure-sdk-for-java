// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Configuration of a virtual network to which API Management service is deployed.
 */
@Fluent
public final class VirtualNetworkConfiguration implements JsonSerializable<VirtualNetworkConfiguration> {
    /*
     * The virtual network ID. This is typically a GUID. Expect a null GUID by default.
     */
    private String vnetid;

    /*
     * The name of the subnet.
     */
    private String subnetname;

    /*
     * The full resource ID of a subnet in a virtual network to deploy the API Management service in.
     */
    private String subnetResourceId;

    /**
     * Creates an instance of VirtualNetworkConfiguration class.
     */
    public VirtualNetworkConfiguration() {
    }

    /**
     * Get the vnetid property: The virtual network ID. This is typically a GUID. Expect a null GUID by default.
     * 
     * @return the vnetid value.
     */
    public String vnetid() {
        return this.vnetid;
    }

    /**
     * Get the subnetname property: The name of the subnet.
     * 
     * @return the subnetname value.
     */
    public String subnetname() {
        return this.subnetname;
    }

    /**
     * Get the subnetResourceId property: The full resource ID of a subnet in a virtual network to deploy the API
     * Management service in.
     * 
     * @return the subnetResourceId value.
     */
    public String subnetResourceId() {
        return this.subnetResourceId;
    }

    /**
     * Set the subnetResourceId property: The full resource ID of a subnet in a virtual network to deploy the API
     * Management service in.
     * 
     * @param subnetResourceId the subnetResourceId value to set.
     * @return the VirtualNetworkConfiguration object itself.
     */
    public VirtualNetworkConfiguration withSubnetResourceId(String subnetResourceId) {
        this.subnetResourceId = subnetResourceId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("subnetResourceId", this.subnetResourceId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualNetworkConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualNetworkConfiguration if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualNetworkConfiguration.
     */
    public static VirtualNetworkConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualNetworkConfiguration deserializedVirtualNetworkConfiguration = new VirtualNetworkConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vnetid".equals(fieldName)) {
                    deserializedVirtualNetworkConfiguration.vnetid = reader.getString();
                } else if ("subnetname".equals(fieldName)) {
                    deserializedVirtualNetworkConfiguration.subnetname = reader.getString();
                } else if ("subnetResourceId".equals(fieldName)) {
                    deserializedVirtualNetworkConfiguration.subnetResourceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualNetworkConfiguration;
        });
    }
}
