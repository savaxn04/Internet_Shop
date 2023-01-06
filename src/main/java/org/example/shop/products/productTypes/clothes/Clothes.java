package org.example.shop.products.productTypes.clothes;

import org.example.enums.product.ProductType;
import org.example.enums.product.Size;
import org.example.shop.products.Product;

import java.util.Objects;

public class Clothes extends Product{
    private final ProductType type;
    private Size size;

    public Clothes(String name, double price, int count, String description, Size size) {
        super(name, price, count, description);
        this.type = ProductType.CLOTHES;
        this.size = size;
    }

    @Override
    public ProductType getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clothes clothes)) return false;
        if (!super.equals(o)) return false;
        return type == clothes.type && size == clothes.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, size);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "type=" + type +
                ", size=" + size +
                '}';
    }
}
