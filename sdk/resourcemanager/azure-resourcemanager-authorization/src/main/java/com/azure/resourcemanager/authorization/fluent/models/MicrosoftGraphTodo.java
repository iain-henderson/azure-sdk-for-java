// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * todo.
 */
@Fluent
public final class MicrosoftGraphTodo extends MicrosoftGraphEntity {
    /*
     * The task lists in the users mailbox.
     */
    private List<MicrosoftGraphTodoTaskList> lists;

    /*
     * todo
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphTodo class.
     */
    public MicrosoftGraphTodo() {
    }

    /**
     * Get the lists property: The task lists in the users mailbox.
     * 
     * @return the lists value.
     */
    public List<MicrosoftGraphTodoTaskList> lists() {
        return this.lists;
    }

    /**
     * Set the lists property: The task lists in the users mailbox.
     * 
     * @param lists the lists value to set.
     * @return the MicrosoftGraphTodo object itself.
     */
    public MicrosoftGraphTodo withLists(List<MicrosoftGraphTodoTaskList> lists) {
        this.lists = lists;
        return this;
    }

    /**
     * Get the additionalProperties property: todo.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: todo.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTodo object itself.
     */
    public MicrosoftGraphTodo withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphTodo withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (lists() != null) {
            lists().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeArrayField("lists", this.lists, (writer, element) -> writer.writeJson(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphTodo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphTodo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphTodo.
     */
    public static MicrosoftGraphTodo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphTodo deserializedMicrosoftGraphTodo = new MicrosoftGraphTodo();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphTodo.withId(reader.getString());
                } else if ("lists".equals(fieldName)) {
                    List<MicrosoftGraphTodoTaskList> lists
                        = reader.readArray(reader1 -> MicrosoftGraphTodoTaskList.fromJson(reader1));
                    deserializedMicrosoftGraphTodo.lists = lists;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphTodo.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphTodo;
        });
    }
}
