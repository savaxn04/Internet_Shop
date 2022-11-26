package org.example.products;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Product {
    private String name;
    private double price;
    List<Product> products;

    public List<Product> getProducts() {
        return products;
    }
    public Product(List<Product> products) {
        this.products = products;
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && name.equals(product.name) && Objects.equals(products, product.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, products);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
