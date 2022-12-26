package org.example.interfaces;

import org.example.shop.products.Product;

public interface IActionWithProductInStorage {
    void addProduct(Product product);
    void removeProduct(Product product);
}
