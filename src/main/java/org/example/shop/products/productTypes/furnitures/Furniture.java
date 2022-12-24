package org.example.shop.products.productTypes.furnitures;

import org.example.enums.product.ProductType;
import org.example.enums.product.Size;
import org.example.enums.product.materials.FurnituresMaterials;
import org.example.shop.products.Product;

import java.util.Objects;

public class Furniture extends Product {
    private final ProductType type;
    private final FurnituresMaterials material;

    public Furniture(String name, double price, int count, String description, FurnituresMaterials material) {
        super(name, price, count, description);
        this.type = ProductType.FURNITURE;
        this.material = material;
    }

    public ProductType getType() {
        return type;
    }

    public FurnituresMaterials getMaterial() {
        return material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Furniture furniture)) return false;
        if (!super.equals(o)) return false;
        return type == furniture.type && material == furniture.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, material);
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "type=" + type +
                ", material=" + material +
                '}';
    }
}
