package com.bosch.example;

import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook;

/** Demonstrates creating an OOXML workbook schema object. */
public final class PoiSchemaExample {
    private PoiSchemaExample() {
    }

    public static boolean createsWorkbook() {
        return CTWorkbook.Factory.newInstance() != null;
    }
}
