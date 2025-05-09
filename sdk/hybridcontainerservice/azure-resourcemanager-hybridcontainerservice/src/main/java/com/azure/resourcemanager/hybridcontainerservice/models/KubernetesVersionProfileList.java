// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.KubernetesVersionProfileInner;
import java.io.IOException;
import java.util.List;

/**
 * List of supported kubernetes versions.
 */
@Fluent
public final class KubernetesVersionProfileList implements JsonSerializable<KubernetesVersionProfileList> {
    /*
     * The value property.
     */
    private List<KubernetesVersionProfileInner> value;

    /*
     * The nextLink property.
     */
    private String nextLink;

    /**
     * Creates an instance of KubernetesVersionProfileList class.
     */
    public KubernetesVersionProfileList() {
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public List<KubernetesVersionProfileInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the KubernetesVersionProfileList object itself.
     */
    public KubernetesVersionProfileList withValue(List<KubernetesVersionProfileInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The nextLink property.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The nextLink property.
     * 
     * @param nextLink the nextLink value to set.
     * @return the KubernetesVersionProfileList object itself.
     */
    public KubernetesVersionProfileList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KubernetesVersionProfileList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KubernetesVersionProfileList if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the KubernetesVersionProfileList.
     */
    public static KubernetesVersionProfileList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KubernetesVersionProfileList deserializedKubernetesVersionProfileList = new KubernetesVersionProfileList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<KubernetesVersionProfileInner> value
                        = reader.readArray(reader1 -> KubernetesVersionProfileInner.fromJson(reader1));
                    deserializedKubernetesVersionProfileList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedKubernetesVersionProfileList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKubernetesVersionProfileList;
        });
    }
}
