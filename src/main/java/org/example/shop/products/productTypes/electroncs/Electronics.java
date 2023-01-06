package org.example.shop.products.productTypes.electroncs;

import org.example.enums.product.ProductType;
import org.example.enums.product.Size;
import org.example.enums.product.electronics.MemoryCapacity;
import org.example.enums.product.electronics.OperatingMemory;
import org.example.enums.product.materials.ElectronicsMaterials;
import org.example.shop.products.Product;

import java.util.Objects;

public class Electronics extends Product {
    private final ProductType type;
    private final MemoryCapacity memoryCapacity;
    private final OperatingMemory operatingMemory;
    private final ElectronicsMaterials electronicsMaterials;

    public Electronics(String name, double price, int count, String description, MemoryCapacity memoryCapacity, OperatingMemory operatingMemory, ElectronicsMaterials electronicsMaterials) {
        super(name, price, count, description);
        this.type = ProductType.ELECTRONICS;
        this.memoryCapacity = memoryCapacity;
        this.operatingMemory = operatingMemory;
        this.electronicsMaterials = electronicsMaterials;
    }

    @Override
    public ProductType getType() {
        return type;
    }

    public MemoryCapacity getMemoryCapacity() {
        return memoryCapacity;
    }

    public OperatingMemory getOperatingMemory() {
        return operatingMemory;
    }

    public ElectronicsMaterials getElectronicsMaterials() {
        return electronicsMaterials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Electronics that)) return false;
        if (!super.equals(o)) return false;
        return type == that.type && memoryCapacity == that.memoryCapacity && operatingMemory == that.operatingMemory && electronicsMaterials == that.electronicsMaterials;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, memoryCapacity, operatingMemory, electronicsMaterials);
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "type=" + type +
                ", memoryCapacity=" + memoryCapacity +
                ", operatingMemory=" + operatingMemory +
                ", electronicsMaterials=" + electronicsMaterials +
                '}';
    }
}
