package org.example.interfaces;

import org.example.entity.products.Product;

public interface IActionWithProductInStorage {
    void addProduct(Product product);
    void removeProduct(Product product);
}
