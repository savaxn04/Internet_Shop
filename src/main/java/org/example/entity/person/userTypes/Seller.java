package org.example.entity.person.userTypes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.enums.user.Role;
import org.example.enums.user.UserStatus;
import org.example.exceptions.SellerDontHaveProductInSelletProductsException;
import org.example.entity.products.Product;

import java.util.List;
import java.util.Objects;

public class Seller extends User {
    private static final Logger LOGGER = LogManager.getLogger(Seller.class);

    private List<Product> sellerProducts;

    public void addProducts(Product product){
        if(sellerProducts.contains(product)){
            product.setCount(product.getCount() + 1);
            sellerProducts.get(sellerProducts.indexOf(product)).setCount(sellerProducts.get(sellerProducts.indexOf(product)).getCount() + 1);
        }
        else{
            LOGGER.error("Seller added product");
            sellerProducts.add(product);
        }
    }

    public void removeProducts(Product product){
        if(sellerProducts.contains(product)){
            sellerProducts.get(sellerProducts.indexOf(product)).setCount(sellerProducts.get(sellerProducts.indexOf(product)).getCount() - 1);
        }
        else{
            LOGGER.error("Seller don't have this product");
            throw new SellerDontHaveProductInSelletProductsException("Seller don't have this product");
        }
    }

    public Seller() {
    }

    public Seller(String name, String surname) {
        super(name, surname, Role.SELLER, UserStatus.NORMAL);
    }

    public List<Product> getSellerProducts() {
        return sellerProducts;
    }

    public void setSellerProducts(List<Product> sellerProducts) {
        this.sellerProducts = sellerProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller seller)) return false;
        return Objects.equals(sellerProducts, seller.sellerProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerProducts);
    }

    @Override
    public String toString() {
        return "Seller{" + super.toString() +
                ", sellerProducts=" + sellerProducts +
                '}' ;
    }
}
