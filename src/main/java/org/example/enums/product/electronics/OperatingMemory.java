package org.example.enums.product.electronics;

public enum OperatingMemory {
    FOUR(4), EIGHT(8),  SIXTEEN(16), THIRTY_TWO(32);
    private final int value;
    OperatingMemory(int i) {
        this.value = i;
    }
    public int getValue() {
        return value;
    }
}
