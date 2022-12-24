package org.example.enums.product.materials;

public enum ClothesMaterials {
    SYNTHETIC("Synthetic"), COTTON("Cotton");
    private final String value;
    ClothesMaterials(String string) {
        this.value = string;
    }
    public String getValue() {
        return value;
    }
}
