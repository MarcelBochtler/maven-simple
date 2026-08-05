package com.bosch.example;

import com.sun.jna.Native;

/** Demonstrates retrieving a native type size with JNA. */
public final class NativeLibraryExample {
    private NativeLibraryExample() {
    }

    public static int integerSize() {
        return Native.getNativeSize(Integer.TYPE);
    }
}
