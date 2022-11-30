package org.example;

public enum Role {
    CUSTOMER(1), SELLER(2),  ADMIN(3);

    private int value;

    Role(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }
}
