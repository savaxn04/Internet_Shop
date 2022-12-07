package org.example.staff;

import org.example.products.Category;
import org.example.products.Product;

public interface IEmployeeAction {
    public default boolean checkProductInCategory(Product product, Category category){
        return category.getCategory().contains(product);
    }
}
