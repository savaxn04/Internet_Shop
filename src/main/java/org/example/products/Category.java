package org.example.products;

import java.util.List;

public class Category {
    private List<Product> category;

    public void addProduct(Product product){
        category.add(product);
    }

    public Category() {
    }

    public Category(List<Product> category) {
        this.category = category;
    }

    public List<Product> getCategory() {
        return category;
    }

    public void setCategory(List<Product> category) {
        this.category = category;
    }
}
