// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storage.models.ObjectReplicationPolicyPropertiesMetrics;
import com.azure.resourcemanager.storage.models.ObjectReplicationPolicyRule;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The replication policy between two storage accounts. Multiple rules can be defined in one policy.
 */
@Fluent
public final class ObjectReplicationPolicyInner extends ProxyResource {
    /*
     * Returns the Storage Account Object Replication Policy.
     */
    private ObjectReplicationPolicyProperties innerProperties;

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
     * Creates an instance of ObjectReplicationPolicyInner class.
     */
    public ObjectReplicationPolicyInner() {
    }

    /**
     * Get the innerProperties property: Returns the Storage Account Object Replication Policy.
     * 
     * @return the innerProperties value.
     */
    private ObjectReplicationPolicyProperties innerProperties() {
        return this.innerProperties;
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
     * Get the policyId property: A unique id for object replication policy.
     * 
     * @return the policyId value.
     */
    public String policyId() {
        return this.innerProperties() == null ? null : this.innerProperties().policyId();
    }

    /**
     * Get the enabledTime property: Indicates when the policy is enabled on the source account.
     * 
     * @return the enabledTime value.
     */
    public OffsetDateTime enabledTime() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledTime();
    }

    /**
     * Get the sourceAccount property: Required. Source account name. It should be full resource id if
     * allowCrossTenantReplication set to false.
     * 
     * @return the sourceAccount value.
     */
    public String sourceAccount() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceAccount();
    }

    /**
     * Set the sourceAccount property: Required. Source account name. It should be full resource id if
     * allowCrossTenantReplication set to false.
     * 
     * @param sourceAccount the sourceAccount value to set.
     * @return the ObjectReplicationPolicyInner object itself.
     */
    public ObjectReplicationPolicyInner withSourceAccount(String sourceAccount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ObjectReplicationPolicyProperties();
        }
        this.innerProperties().withSourceAccount(sourceAccount);
        return this;
    }

    /**
     * Get the destinationAccount property: Required. Destination account name. It should be full resource id if
     * allowCrossTenantReplication set to false.
     * 
     * @return the destinationAccount value.
     */
    public String destinationAccount() {
        return this.innerProperties() == null ? null : this.innerProperties().destinationAccount();
    }

    /**
     * Set the destinationAccount property: Required. Destination account name. It should be full resource id if
     * allowCrossTenantReplication set to false.
     * 
     * @param destinationAccount the destinationAccount value to set.
     * @return the ObjectReplicationPolicyInner object itself.
     */
    public ObjectReplicationPolicyInner withDestinationAccount(String destinationAccount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ObjectReplicationPolicyProperties();
        }
        this.innerProperties().withDestinationAccount(destinationAccount);
        return this;
    }

    /**
     * Get the rules property: The storage account object replication rules.
     * 
     * @return the rules value.
     */
    public List<ObjectReplicationPolicyRule> rules() {
        return this.innerProperties() == null ? null : this.innerProperties().rules();
    }

    /**
     * Set the rules property: The storage account object replication rules.
     * 
     * @param rules the rules value to set.
     * @return the ObjectReplicationPolicyInner object itself.
     */
    public ObjectReplicationPolicyInner withRules(List<ObjectReplicationPolicyRule> rules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ObjectReplicationPolicyProperties();
        }
        this.innerProperties().withRules(rules);
        return this;
    }

    /**
     * Get the metrics property: Optional. The object replication policy metrics feature options.
     * 
     * @return the metrics value.
     */
    public ObjectReplicationPolicyPropertiesMetrics metrics() {
        return this.innerProperties() == null ? null : this.innerProperties().metrics();
    }

    /**
     * Set the metrics property: Optional. The object replication policy metrics feature options.
     * 
     * @param metrics the metrics value to set.
     * @return the ObjectReplicationPolicyInner object itself.
     */
    public ObjectReplicationPolicyInner withMetrics(ObjectReplicationPolicyPropertiesMetrics metrics) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ObjectReplicationPolicyProperties();
        }
        this.innerProperties().withMetrics(metrics);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ObjectReplicationPolicyInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ObjectReplicationPolicyInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ObjectReplicationPolicyInner.
     */
    public static ObjectReplicationPolicyInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ObjectReplicationPolicyInner deserializedObjectReplicationPolicyInner = new ObjectReplicationPolicyInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedObjectReplicationPolicyInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedObjectReplicationPolicyInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedObjectReplicationPolicyInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedObjectReplicationPolicyInner.innerProperties
                        = ObjectReplicationPolicyProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedObjectReplicationPolicyInner;
        });
    }
}
