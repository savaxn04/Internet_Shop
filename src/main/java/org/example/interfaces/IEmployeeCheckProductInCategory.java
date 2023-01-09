package org.example.interfaces;

import org.example.entity.products.Category;
import org.example.entity.products.Product;

public interface IEmployeeCheckProductInCategory {
    boolean checkProductInCategory(Product product, Category category);
}
