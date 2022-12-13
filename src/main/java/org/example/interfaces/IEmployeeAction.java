package org.example.interfaces;

import org.example.products.Category;
import org.example.products.Product;

public interface IEmployeeAction {
    default boolean checkProductInCategory(Product product, Category category){
        return category.getCategory().contains(product);
    }
}
