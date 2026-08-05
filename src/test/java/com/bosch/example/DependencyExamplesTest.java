package com.bosch.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/** Exercises the dependency examples. */
class DependencyExamplesTest {
    @Test
    void examplesProduceExpectedValues() {
        assertTrue(NativeLibraryExample.integerSize() > 0);
        assertTrue(NettyCodecExample.bufferSize() == 3);
        assertTrue(PostgresExample.userPropertyName().length() > 0);
        assertTrue(OrtModelExample.coordinates().contains("maven-simple"));
        assertTrue(SemverExample.isAtLeastOne());
        assertTrue(FuzzySearchExample.similarityScore() > 0);
        assertTrue(PoiSchemaExample.createsWorkbook());
    }
}
