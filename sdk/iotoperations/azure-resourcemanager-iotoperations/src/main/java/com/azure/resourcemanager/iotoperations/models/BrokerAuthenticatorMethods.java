// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Set of broker authentication policies. Only one method is supported for each entry.
 */
@Fluent
public final class BrokerAuthenticatorMethods implements JsonSerializable<BrokerAuthenticatorMethods> {
    /*
     * Custom authentication configuration.
     */
    private BrokerAuthenticationMethod method;

    /*
     * Custom authentication configuration.
     */
    private BrokerAuthenticatorMethodCustom customSettings;

    /*
     * ServiceAccountToken authentication configuration.
     */
    private BrokerAuthenticatorMethodSat serviceAccountTokenSettings;

    /*
     * X.509 authentication configuration.
     */
    private BrokerAuthenticatorMethodX509 x509Settings;

    /**
     * Creates an instance of BrokerAuthenticatorMethods class.
     */
    public BrokerAuthenticatorMethods() {
    }

    /**
     * Get the method property: Custom authentication configuration.
     * 
     * @return the method value.
     */
    public BrokerAuthenticationMethod method() {
        return this.method;
    }

    /**
     * Set the method property: Custom authentication configuration.
     * 
     * @param method the method value to set.
     * @return the BrokerAuthenticatorMethods object itself.
     */
    public BrokerAuthenticatorMethods withMethod(BrokerAuthenticationMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the customSettings property: Custom authentication configuration.
     * 
     * @return the customSettings value.
     */
    public BrokerAuthenticatorMethodCustom customSettings() {
        return this.customSettings;
    }

    /**
     * Set the customSettings property: Custom authentication configuration.
     * 
     * @param customSettings the customSettings value to set.
     * @return the BrokerAuthenticatorMethods object itself.
     */
    public BrokerAuthenticatorMethods withCustomSettings(BrokerAuthenticatorMethodCustom customSettings) {
        this.customSettings = customSettings;
        return this;
    }

    /**
     * Get the serviceAccountTokenSettings property: ServiceAccountToken authentication configuration.
     * 
     * @return the serviceAccountTokenSettings value.
     */
    public BrokerAuthenticatorMethodSat serviceAccountTokenSettings() {
        return this.serviceAccountTokenSettings;
    }

    /**
     * Set the serviceAccountTokenSettings property: ServiceAccountToken authentication configuration.
     * 
     * @param serviceAccountTokenSettings the serviceAccountTokenSettings value to set.
     * @return the BrokerAuthenticatorMethods object itself.
     */
    public BrokerAuthenticatorMethods
        withServiceAccountTokenSettings(BrokerAuthenticatorMethodSat serviceAccountTokenSettings) {
        this.serviceAccountTokenSettings = serviceAccountTokenSettings;
        return this;
    }

    /**
     * Get the x509Settings property: X.509 authentication configuration.
     * 
     * @return the x509Settings value.
     */
    public BrokerAuthenticatorMethodX509 x509Settings() {
        return this.x509Settings;
    }

    /**
     * Set the x509Settings property: X.509 authentication configuration.
     * 
     * @param x509Settings the x509Settings value to set.
     * @return the BrokerAuthenticatorMethods object itself.
     */
    public BrokerAuthenticatorMethods withX509Settings(BrokerAuthenticatorMethodX509 x509Settings) {
        this.x509Settings = x509Settings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (method() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property method in model BrokerAuthenticatorMethods"));
        }
        if (customSettings() != null) {
            customSettings().validate();
        }
        if (serviceAccountTokenSettings() != null) {
            serviceAccountTokenSettings().validate();
        }
        if (x509Settings() != null) {
            x509Settings().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BrokerAuthenticatorMethods.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("method", this.method == null ? null : this.method.toString());
        jsonWriter.writeJsonField("customSettings", this.customSettings);
        jsonWriter.writeJsonField("serviceAccountTokenSettings", this.serviceAccountTokenSettings);
        jsonWriter.writeJsonField("x509Settings", this.x509Settings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BrokerAuthenticatorMethods from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BrokerAuthenticatorMethods if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BrokerAuthenticatorMethods.
     */
    public static BrokerAuthenticatorMethods fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BrokerAuthenticatorMethods deserializedBrokerAuthenticatorMethods = new BrokerAuthenticatorMethods();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("method".equals(fieldName)) {
                    deserializedBrokerAuthenticatorMethods.method
                        = BrokerAuthenticationMethod.fromString(reader.getString());
                } else if ("customSettings".equals(fieldName)) {
                    deserializedBrokerAuthenticatorMethods.customSettings
                        = BrokerAuthenticatorMethodCustom.fromJson(reader);
                } else if ("serviceAccountTokenSettings".equals(fieldName)) {
                    deserializedBrokerAuthenticatorMethods.serviceAccountTokenSettings
                        = BrokerAuthenticatorMethodSat.fromJson(reader);
                } else if ("x509Settings".equals(fieldName)) {
                    deserializedBrokerAuthenticatorMethods.x509Settings
                        = BrokerAuthenticatorMethodX509.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBrokerAuthenticatorMethods;
        });
    }
}
