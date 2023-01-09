package org.example.interfaces;

import org.example.entity.products.Product;

import java.util.List;

public interface IGetProductsWithMinOrMaxPrice {
    List<Product> getProductsWithMinPrice();
    List<Product> getProductsWithMaxPrice();
}
