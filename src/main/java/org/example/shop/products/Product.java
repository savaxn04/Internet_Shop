package org.example.shop.products;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public abstract class Product {
    private static final Logger LOGGER = LogManager.getLogger(Product.class);
    private String name;
    private double price;
    private int count;
    private String description;

    public Product() {
    }

    public Product(String name, double price, int count, String description) {
        this.name = name;
        if(price <= 0){
            throw new IllegalArgumentException("price of product can't be <= then 0");
        }
        else{
            this.price = price;
        }
        if(count <= 0){
            throw new IllegalArgumentException("Count of product can't be <= then 0");
        }
        else{
            this.count = count;
        }
        this.description = description;
        LOGGER.info("Product created");
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
        if(price <= 0){
            throw new IllegalArgumentException("price of product can't be <= then 0");
        }
        else{
            this.price = price;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if(count <= 0){
            throw new IllegalArgumentException("Count of product can't be <= then 0");
        }
        else{
            this.count = count;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(product.price, price) == 0 && count == product.count && name.equals(product.name) && description.equals(product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, count, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", description='" + description + '\'' +
                '}';
    }
}
