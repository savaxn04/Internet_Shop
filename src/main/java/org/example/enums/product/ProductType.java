package org.example.enums.product;

public enum ProductType {
    CLOTHES("Clothes"), ELECTRONICS("Electronics"),  FURNITURE("Furniture"), DEFAULT("DEFAULT");;
    private final String value;
    ProductType(String string) {
        this.value = string;
    }

    public String getValue() {
        return value;
    }
}
