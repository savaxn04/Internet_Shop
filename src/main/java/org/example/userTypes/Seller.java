package org.example.userTypes;

import org.example.Role;
import org.example.products.Product;

import java.util.List;
import java.util.Objects;

public class Seller extends User{
    private List<Product> sellerProducts;

    public void addProducts(Product product){
        if(sellerProducts.contains(product)){
            product.setCount(product.getCount() + 1);
        }
        else {
            sellerProducts.add(product);
        }
    }

    public void removeProducts(Product product){
        if(sellerProducts.contains(product)){
            sellerProducts.remove(product);
        }
        else {
            product.setCount(product.getCount() - 1);
        }
    }

    public Seller() {
    }

    public Seller(String name, String surname, String status,List<Product> sellerProducts) {
        super(name, surname, status, Role.SELLER);
        this.sellerProducts = sellerProducts;
    }

    public List<Product> getSellerProducts() {
        return sellerProducts;
    }

    public void setSellerProducts(List<Product> sellerProducts) {
        this.sellerProducts = sellerProducts;
    }
}
