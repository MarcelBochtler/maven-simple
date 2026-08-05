package com.bosch.example;

import com.vdurmont.semver4j.Semver;

/** Demonstrates comparing semantic versions. */
public final class SemverExample {
    private SemverExample() {
    }

    public static boolean isAtLeastOne() {
        return new Semver("1.2.3").isGreaterThanOrEqualTo("1.0.0");
    }
}
