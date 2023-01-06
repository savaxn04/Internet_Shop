package org.example.interfaces;

import org.example.shop.products.Product;

import java.util.List;
public interface IGetAllProductsWithTypeFilter {
    List<Product> getOnlyClothes();
    List<Product> getOnlyElectronics();
    List<Product> getOnlyFurniture();

}
