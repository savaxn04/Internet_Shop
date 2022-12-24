package org.example.shop.products;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.shop.person.userTypes.Seller;

import java.util.List;
import java.util.Objects;

public class Category {
    private static final Logger logger = LogManager.getLogger(Category.class);
    private List<Product> category;
    public void addProduct(Product product){
        category.add(product);
        logger.info("Product added to product list");
    }
    public void removeProduct(Product product){
        category.remove(product);
        logger.info("Product removed from product list");
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
