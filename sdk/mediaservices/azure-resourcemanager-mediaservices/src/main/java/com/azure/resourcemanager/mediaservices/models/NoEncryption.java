// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Class for NoEncryption scheme.
 */
@Fluent
public final class NoEncryption implements JsonSerializable<NoEncryption> {
    /*
     * Representing supported protocols
     */
    private EnabledProtocols enabledProtocols;

    /**
     * Creates an instance of NoEncryption class.
     */
    public NoEncryption() {
    }

    /**
     * Get the enabledProtocols property: Representing supported protocols.
     * 
     * @return the enabledProtocols value.
     */
    public EnabledProtocols enabledProtocols() {
        return this.enabledProtocols;
    }

    /**
     * Set the enabledProtocols property: Representing supported protocols.
     * 
     * @param enabledProtocols the enabledProtocols value to set.
     * @return the NoEncryption object itself.
     */
    public NoEncryption withEnabledProtocols(EnabledProtocols enabledProtocols) {
        this.enabledProtocols = enabledProtocols;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (enabledProtocols() != null) {
            enabledProtocols().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("enabledProtocols", this.enabledProtocols);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NoEncryption from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NoEncryption if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the NoEncryption.
     */
    public static NoEncryption fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NoEncryption deserializedNoEncryption = new NoEncryption();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabledProtocols".equals(fieldName)) {
                    deserializedNoEncryption.enabledProtocols = EnabledProtocols.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNoEncryption;
        });
    }
}
