package org.example.enums.product.materials;

public enum ElectronicsMaterials {
    ALUMINIUM("Aluminium"), PLASTIC("Plastic");
    private final String value;
    ElectronicsMaterials(String string) {
        this.value = string;
    }
    public String getValue() {
        return value;
    }
}
