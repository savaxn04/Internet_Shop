package org.example.products;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int count;
    private String description;
    private String type;

    public Product() {
    }

    public Product(String name, double price, int count, String description, String type) {
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
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
