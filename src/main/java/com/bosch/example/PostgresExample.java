package com.bosch.example;

import org.postgresql.PGProperty;

/** Demonstrates accessing PostgreSQL JDBC connection-property metadata. */
public final class PostgresExample {
    private PostgresExample() {
    }

    public static String userPropertyName() {
        return PGProperty.USER.getName();
    }
}
