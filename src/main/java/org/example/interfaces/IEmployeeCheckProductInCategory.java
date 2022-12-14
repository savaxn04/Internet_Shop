package org.example.interfaces;

import org.example.shop.products.Category;
import org.example.shop.products.Product;

public interface IEmployeeCheckProductInCategory {
    default boolean checkProductInCategory(Product product, Category category){
        return category.getCategory().contains(product);
    }
}
