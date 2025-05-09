// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The properties of a logFile.
 */
@Fluent
public final class LogFileProperties implements JsonSerializable<LogFileProperties> {
    /*
     * Creation timestamp of the log file.
     */
    private OffsetDateTime createdTime;

    /*
     * Last modified timestamp of the log file.
     */
    private OffsetDateTime lastModifiedTime;

    /*
     * The size in kb of the logFile.
     */
    private Long sizeInKb;

    /*
     * Type of the log file.
     */
    private String type;

    /*
     * The url to download the log file from.
     */
    private String url;

    /**
     * Creates an instance of LogFileProperties class.
     */
    public LogFileProperties() {
    }

    /**
     * Get the createdTime property: Creation timestamp of the log file.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Set the createdTime property: Creation timestamp of the log file.
     * 
     * @param createdTime the createdTime value to set.
     * @return the LogFileProperties object itself.
     */
    public LogFileProperties withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get the lastModifiedTime property: Last modified timestamp of the log file.
     * 
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set the lastModifiedTime property: Last modified timestamp of the log file.
     * 
     * @param lastModifiedTime the lastModifiedTime value to set.
     * @return the LogFileProperties object itself.
     */
    public LogFileProperties withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get the sizeInKb property: The size in kb of the logFile.
     * 
     * @return the sizeInKb value.
     */
    public Long sizeInKb() {
        return this.sizeInKb;
    }

    /**
     * Set the sizeInKb property: The size in kb of the logFile.
     * 
     * @param sizeInKb the sizeInKb value to set.
     * @return the LogFileProperties object itself.
     */
    public LogFileProperties withSizeInKb(Long sizeInKb) {
        this.sizeInKb = sizeInKb;
        return this;
    }

    /**
     * Get the type property: Type of the log file.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the log file.
     * 
     * @param type the type value to set.
     * @return the LogFileProperties object itself.
     */
    public LogFileProperties withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the url property: The url to download the log file from.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: The url to download the log file from.
     * 
     * @param url the url value to set.
     * @return the LogFileProperties object itself.
     */
    public LogFileProperties withUrl(String url) {
        this.url = url;
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
        jsonWriter.writeStringField("createdTime",
            this.createdTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createdTime));
        jsonWriter.writeStringField("lastModifiedTime",
            this.lastModifiedTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastModifiedTime));
        jsonWriter.writeNumberField("sizeInKb", this.sizeInKb);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("url", this.url);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LogFileProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LogFileProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LogFileProperties.
     */
    public static LogFileProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LogFileProperties deserializedLogFileProperties = new LogFileProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("createdTime".equals(fieldName)) {
                    deserializedLogFileProperties.createdTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastModifiedTime".equals(fieldName)) {
                    deserializedLogFileProperties.lastModifiedTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("sizeInKb".equals(fieldName)) {
                    deserializedLogFileProperties.sizeInKb = reader.getNullable(JsonReader::getLong);
                } else if ("type".equals(fieldName)) {
                    deserializedLogFileProperties.type = reader.getString();
                } else if ("url".equals(fieldName)) {
                    deserializedLogFileProperties.url = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogFileProperties;
        });
    }
}
