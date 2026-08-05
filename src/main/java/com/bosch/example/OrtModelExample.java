package com.bosch.example;

import org.ossreviewtoolkit.model.Identifier;

/** Demonstrates constructing an ORT package identifier. */
public final class OrtModelExample {
    private OrtModelExample() {
    }

    public static String coordinates() {
        Identifier identifier = new Identifier("Maven", "com.bosch.example", "maven-simple", "1.0");
        return identifier.toCoordinates();
    }
}
