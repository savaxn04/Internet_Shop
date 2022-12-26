package org.example.shop.products;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.interfaces.IActionWithProductInStorage;

import java.util.List;
import java.util.Objects;

public class Category implements IActionWithProductInStorage {
    private static final Logger LOGGER = LogManager.getLogger(Category.class);
    private List<Product> category;

    @Override
    public void addProduct(Product product){
        category.add(product);
        LOGGER.info("Product added to product list");
    }

    @Override
    public void removeProduct(Product product){
        category.remove(product);
        LOGGER.info("Product removed from product list");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category category1)) return false;
        return Objects.equals(category, category1.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category);
    }

    @Override
    public String toString() {
        return "Category{" +
                "category=" + category +
                '}';
    }
}
