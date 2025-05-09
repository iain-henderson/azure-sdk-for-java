// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The mode to update a new PostgreSQL server.
 */
public final class CreateModeForUpdate extends ExpandableStringEnum<CreateModeForUpdate> {
    /**
     * Static value Default for CreateModeForUpdate.
     */
    public static final CreateModeForUpdate DEFAULT = fromString("Default");

    /**
     * Static value Update for CreateModeForUpdate.
     */
    public static final CreateModeForUpdate UPDATE = fromString("Update");

    /**
     * Creates a new instance of CreateModeForUpdate value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CreateModeForUpdate() {
    }

    /**
     * Creates or finds a CreateModeForUpdate from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CreateModeForUpdate.
     */
    public static CreateModeForUpdate fromString(String name) {
        return fromString(name, CreateModeForUpdate.class);
    }

    /**
     * Gets known CreateModeForUpdate values.
     * 
     * @return known CreateModeForUpdate values.
     */
    public static Collection<CreateModeForUpdate> values() {
        return values(CreateModeForUpdate.class);
    }
}
