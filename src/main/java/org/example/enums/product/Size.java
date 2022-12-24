package org.example.enums.product;

public enum Size {
    S("S"), M("M"),  L("L"), XL("XL"), XXL("XXL");
    private final String value;
    Size(String string) {
        this.value = string;
    }
    public String getValue() {
        return value;
    }
}
