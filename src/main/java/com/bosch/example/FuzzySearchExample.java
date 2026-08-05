package com.bosch.example;

import me.xdrop.fuzzywuzzy.FuzzySearch;

/** Demonstrates scoring the similarity of two strings. */
public final class FuzzySearchExample {
    private FuzzySearchExample() {
    }

    public static int similarityScore() {
        return FuzzySearch.ratio("dependency", "dependencies");
    }
}
