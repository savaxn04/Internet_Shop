package org.example.enums.user;

public enum Role {
    CUSTOMER(1), SELLER(2),  ADMIN(3);
    private final int value;
    Role(int i) {
        this.value = i;
    }
    public int getValue() {
        return value;
    }
}
