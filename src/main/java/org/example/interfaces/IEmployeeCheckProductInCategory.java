package org.example.interfaces;

import org.example.shop.products.Category;
import org.example.shop.products.Product;

public interface IEmployeeCheckProductInCategory {
    boolean checkProductInCategory(Product product, Category category);
}
