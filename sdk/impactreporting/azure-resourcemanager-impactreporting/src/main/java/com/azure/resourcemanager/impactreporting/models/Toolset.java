// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.impactreporting.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * List of azure interfaces.
 */
public final class Toolset extends ExpandableStringEnum<Toolset> {
    /**
     * If communication toolset is Terraform.
     */
    public static final Toolset TERRAFORM = fromString("Terraform");

    /**
     * If communication toolset is Puppet.
     */
    public static final Toolset PUPPET = fromString("Puppet");

    /**
     * If communication toolset is Chef.
     */
    public static final Toolset CHEF = fromString("Chef");

    /**
     * If communication toolset is SDK.
     */
    public static final Toolset SDK = fromString("SDK");

    /**
     * If communication toolset is Ansible.
     */
    public static final Toolset ANSIBLE = fromString("Ansible");

    /**
     * If communication toolset is ARM.
     */
    public static final Toolset ARM = fromString("ARM");

    /**
     * If communication toolset is Portal.
     */
    public static final Toolset PORTAL = fromString("Portal");

    /**
     * If communication toolset is Shell.
     */
    public static final Toolset SHELL = fromString("Shell");

    /**
     * If communication toolset is Other.
     */
    public static final Toolset OTHER = fromString("Other");

    /**
     * Creates a new instance of Toolset value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Toolset() {
    }

    /**
     * Creates or finds a Toolset from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Toolset.
     */
    public static Toolset fromString(String name) {
        return fromString(name, Toolset.class);
    }

    /**
     * Gets known Toolset values.
     * 
     * @return known Toolset values.
     */
    public static Collection<Toolset> values() {
        return values(Toolset.class);
    }
}
