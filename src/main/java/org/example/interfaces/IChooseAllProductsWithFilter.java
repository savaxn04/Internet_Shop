package org.example.interfaces;

import org.example.shop.products.Product;

import java.util.List;
public interface IChooseAllProductsWithFilter {
    List<Product> chooseOnlyClothes();
    List<Product> chooseOnlyElectronics();
    List<Product> chooseOnlyFurniture();

}
