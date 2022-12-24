package org.example.enums.product.electronics;

public enum MemoryCapacity {
    ONE_HUNDRED_TWENTY_EIGHT(128), TWO_HUNDRED_FIFTY_SIX(256),  FIVE_HUNDRED_TWELVE (512), ONE_THOUSAND_TWENTY_FOUR(1024);
    private final int value;
    MemoryCapacity(int i) {
        this.value = i;
    }
    public int getValue() {
        return value;
    }
}
