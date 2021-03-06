/*
 * This file is generated by jOOQ.
 */
package com.comesample.ktor.jooq.tables.records;


import com.comesample.ktor.jooq.tables.JUsers;

import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JUsersRecord extends UpdatableRecordImpl<JUsersRecord> implements Record4<UUID, LocalDateTime, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -654323430;

    /**
     * Setter for <code>user_access.users.uuid</code>.
     */
    public JUsersRecord setUuid(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>user_access.users.uuid</code>.
     */
    public UUID getUuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>user_access.users.created_at</code>.
     */
    public JUsersRecord setCreatedAt(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>user_access.users.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>user_access.users.updated_at</code>.
     */
    public JUsersRecord setUpdatedAt(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>user_access.users.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>user_access.users.deleted_at</code>.
     */
    public JUsersRecord setDeletedAt(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>user_access.users.deleted_at</code>.
     */
    public LocalDateTime getDeletedAt() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<UUID, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<UUID, LocalDateTime, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return JUsers.USERS.UUID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return JUsers.USERS.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return JUsers.USERS.UPDATED_AT;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return JUsers.USERS.DELETED_AT;
    }

    @Override
    public UUID component1() {
        return getUuid();
    }

    @Override
    public LocalDateTime component2() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component3() {
        return getUpdatedAt();
    }

    @Override
    public LocalDateTime component4() {
        return getDeletedAt();
    }

    @Override
    public UUID value1() {
        return getUuid();
    }

    @Override
    public LocalDateTime value2() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value3() {
        return getUpdatedAt();
    }

    @Override
    public LocalDateTime value4() {
        return getDeletedAt();
    }

    @Override
    public JUsersRecord value1(UUID value) {
        setUuid(value);
        return this;
    }

    @Override
    public JUsersRecord value2(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public JUsersRecord value3(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public JUsersRecord value4(LocalDateTime value) {
        setDeletedAt(value);
        return this;
    }

    @Override
    public JUsersRecord values(UUID value1, LocalDateTime value2, LocalDateTime value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JUsersRecord
     */
    public JUsersRecord() {
        super(JUsers.USERS);
    }

    /**
     * Create a detached, initialised JUsersRecord
     */
    public JUsersRecord(UUID uuid, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt) {
        super(JUsers.USERS);

        set(0, uuid);
        set(1, createdAt);
        set(2, updatedAt);
        set(3, deletedAt);
    }
}
