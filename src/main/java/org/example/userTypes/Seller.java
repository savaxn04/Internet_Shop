package org.example.userTypes;

import org.example.products.Product;

import java.util.List;
import java.util.Objects;

public class Seller {
    private final String name;
    private final String surname;
    private List<Product> sellerProducts;

    public Seller(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Seller(String name, String surname, List<Product> sellerProducts) {
        this.name = name;
        this.surname = surname;
        this.sellerProducts = sellerProducts;
}

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Product> getSellerProducts() {
        return sellerProducts;
    }

    public void setSellerProducts(List<Product> sellerProducts) {
        this.sellerProducts = sellerProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller seller)) return false;
        return name.equals(seller.name) && surname.equals(seller.surname) && Objects.equals(sellerProducts, seller.sellerProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, sellerProducts);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sellerProducts=" + sellerProducts +
                '}';
    }
}
