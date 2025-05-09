// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The parameters used to check the availability of the vault name.
 */
@Fluent
public final class VaultCheckNameAvailabilityParameters
    implements JsonSerializable<VaultCheckNameAvailabilityParameters> {
    /*
     * The vault name.
     */
    private String name;

    /*
     * The type of resource, Microsoft.KeyVault/vaults
     */
    private final String type = "Microsoft.KeyVault/vaults";

    /**
     * Creates an instance of VaultCheckNameAvailabilityParameters class.
     */
    public VaultCheckNameAvailabilityParameters() {
    }

    /**
     * Get the name property: The vault name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The vault name.
     * 
     * @param name the name value to set.
     * @return the VaultCheckNameAvailabilityParameters object itself.
     */
    public VaultCheckNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of resource, Microsoft.KeyVault/vaults.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model VaultCheckNameAvailabilityParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VaultCheckNameAvailabilityParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VaultCheckNameAvailabilityParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VaultCheckNameAvailabilityParameters if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VaultCheckNameAvailabilityParameters.
     */
    public static VaultCheckNameAvailabilityParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VaultCheckNameAvailabilityParameters deserializedVaultCheckNameAvailabilityParameters
                = new VaultCheckNameAvailabilityParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedVaultCheckNameAvailabilityParameters.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVaultCheckNameAvailabilityParameters;
        });
    }
}
