// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * StringNotContains Filter.
 */
@Fluent
public final class StringNotContainsFilter extends Filter {
    /*
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     */
    private FilterOperatorType operatorType = FilterOperatorType.STRING_NOT_CONTAINS;

    /*
     * The set of filter values.
     */
    private List<String> values;

    /**
     * Creates an instance of StringNotContainsFilter class.
     */
    public StringNotContainsFilter() {
    }

    /**
     * Get the operatorType property: The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals
     * and others.
     * 
     * @return the operatorType value.
     */
    @Override
    public FilterOperatorType operatorType() {
        return this.operatorType;
    }

    /**
     * Get the values property: The set of filter values.
     * 
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the values property: The set of filter values.
     * 
     * @param values the values value to set.
     * @return the StringNotContainsFilter object itself.
     */
    public StringNotContainsFilter withValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StringNotContainsFilter withKey(String key) {
        super.withKey(key);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("key", key());
        jsonWriter.writeStringField("operatorType", this.operatorType == null ? null : this.operatorType.toString());
        jsonWriter.writeArrayField("values", this.values, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StringNotContainsFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StringNotContainsFilter if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StringNotContainsFilter.
     */
    public static StringNotContainsFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StringNotContainsFilter deserializedStringNotContainsFilter = new StringNotContainsFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    deserializedStringNotContainsFilter.withKey(reader.getString());
                } else if ("operatorType".equals(fieldName)) {
                    deserializedStringNotContainsFilter.operatorType
                        = FilterOperatorType.fromString(reader.getString());
                } else if ("values".equals(fieldName)) {
                    List<String> values = reader.readArray(reader1 -> reader1.getString());
                    deserializedStringNotContainsFilter.values = values;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStringNotContainsFilter;
        });
    }
}
