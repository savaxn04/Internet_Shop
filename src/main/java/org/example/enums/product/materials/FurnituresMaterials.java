package org.example.enums.product.materials;

public enum FurnituresMaterials {
    WOOD("Wood"), METAL("Metal");
    private final String value;
    FurnituresMaterials(String string) {
        this.value = string;
    }
    public String getValue() {
        return value;
    }
}
