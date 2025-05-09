// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A TrackSelection to select audio tracks.
 */
@Fluent
public class AudioTrackDescriptor extends TrackDescriptor {
    /*
     * The discriminator for derived types.
     */
    private String odataType = "#Microsoft.Media.AudioTrackDescriptor";

    /*
     * Optional designation for single channel audio tracks. Can be used to combine the tracks into stereo or
     * multi-channel audio tracks.
     */
    private ChannelMapping channelMapping;

    /**
     * Creates an instance of AudioTrackDescriptor class.
     */
    public AudioTrackDescriptor() {
    }

    /**
     * Get the odataType property: The discriminator for derived types.
     * 
     * @return the odataType value.
     */
    @Override
    public String odataType() {
        return this.odataType;
    }

    /**
     * Get the channelMapping property: Optional designation for single channel audio tracks. Can be used to combine the
     * tracks into stereo or multi-channel audio tracks.
     * 
     * @return the channelMapping value.
     */
    public ChannelMapping channelMapping() {
        return this.channelMapping;
    }

    /**
     * Set the channelMapping property: Optional designation for single channel audio tracks. Can be used to combine the
     * tracks into stereo or multi-channel audio tracks.
     * 
     * @param channelMapping the channelMapping value to set.
     * @return the AudioTrackDescriptor object itself.
     */
    public AudioTrackDescriptor withChannelMapping(ChannelMapping channelMapping) {
        this.channelMapping = channelMapping;
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
        jsonWriter.writeStringField("@odata.type", this.odataType);
        jsonWriter.writeStringField("channelMapping",
            this.channelMapping == null ? null : this.channelMapping.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AudioTrackDescriptor from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AudioTrackDescriptor if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AudioTrackDescriptor.
     */
    public static AudioTrackDescriptor fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("@odata.type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("#Microsoft.Media.SelectAudioTrackByAttribute".equals(discriminatorValue)) {
                    return SelectAudioTrackByAttribute.fromJson(readerToUse.reset());
                } else if ("#Microsoft.Media.SelectAudioTrackById".equals(discriminatorValue)) {
                    return SelectAudioTrackById.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static AudioTrackDescriptor fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AudioTrackDescriptor deserializedAudioTrackDescriptor = new AudioTrackDescriptor();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    deserializedAudioTrackDescriptor.odataType = reader.getString();
                } else if ("channelMapping".equals(fieldName)) {
                    deserializedAudioTrackDescriptor.channelMapping = ChannelMapping.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAudioTrackDescriptor;
        });
    }
}
