// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.operationsmanagement.models.ManagementConfigurationProperties;
import java.io.IOException;

/**
 * The container for solution.
 */
@Fluent
public final class ManagementConfigurationInner extends ProxyResource {
    /*
     * Resource location
     */
    private String location;

    /*
     * Properties for ManagementConfiguration object supported by the OperationsManagement resource provider.
     */
    private ManagementConfigurationProperties properties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ManagementConfigurationInner class.
     */
    public ManagementConfigurationInner() {
    }

    /**
     * Get the location property: Resource location.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     * 
     * @param location the location value to set.
     * @return the ManagementConfigurationInner object itself.
     */
    public ManagementConfigurationInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the properties property: Properties for ManagementConfiguration object supported by the OperationsManagement
     * resource provider.
     * 
     * @return the properties value.
     */
    public ManagementConfigurationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties for ManagementConfiguration object supported by the OperationsManagement
     * resource provider.
     * 
     * @param properties the properties value to set.
     * @return the ManagementConfigurationInner object itself.
     */
    public ManagementConfigurationInner withProperties(ManagementConfigurationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagementConfigurationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagementConfigurationInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagementConfigurationInner.
     */
    public static ManagementConfigurationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagementConfigurationInner deserializedManagementConfigurationInner = new ManagementConfigurationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedManagementConfigurationInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedManagementConfigurationInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedManagementConfigurationInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedManagementConfigurationInner.location = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedManagementConfigurationInner.properties
                        = ManagementConfigurationProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagementConfigurationInner;
        });
    }
}
