package org.example.enums;

public enum UserStatus {
    NORMAL(0), BLOCK(1);
    private final int value;
    UserStatus(int i) {
        this.value = i;
    }
    public int getValue() {
        return value;
    }
}
