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

    public Seller(String name, String surname,List<Product> sellerProducts) {
        super(name, surname, Role.SELLER);
        this.sellerProducts = sellerProducts;
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
