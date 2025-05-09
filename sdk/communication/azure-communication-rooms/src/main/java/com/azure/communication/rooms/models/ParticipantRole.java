// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.rooms.models;

import com.azure.core.util.ExpandableStringEnum;

import java.util.Collection;

/** Defines values for ParticipantRole. */
public final class ParticipantRole extends ExpandableStringEnum<ParticipantRole> {
    /** Static value Presenter for ParticipantRole. */
    public static final ParticipantRole PRESENTER = fromString("Presenter");

    /** Static value Attendee for ParticipantRole. */
    public static final ParticipantRole ATTENDEE = fromString("Attendee");

    /** Static value Consumer for ParticipantRole. */
    public static final ParticipantRole CONSUMER = fromString("Consumer");

    /** Static value Collaborator for ParticipantRole. */
    public static final ParticipantRole COLLABORATOR = fromString("Collaborator");

    /**
     * Creates a new instance of {@link ParticipantRole} with no string value.
     *
     * @deprecated Please use {@link #fromString(String)} instead.
     */
    @Deprecated
    public ParticipantRole() {
    }

    /**
     * Creates or finds a ParticipantRole from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ParticipantRole.
     */
    public static ParticipantRole fromString(String name) {
        return fromString(name, ParticipantRole.class);
    }

    /**
     * Gets known ParticipantRole values.
     *
     * @return known ParticipantRole values.
     */
    public static Collection<ParticipantRole> values() {
        return values(ParticipantRole.class);
    }
}
