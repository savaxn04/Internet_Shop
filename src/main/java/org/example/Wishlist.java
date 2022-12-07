package org.example;

import org.example.exceptions.WishListIsNullException;
import org.example.products.Product;

import java.util.List;
import java.util.Objects;

public class Wishlist {
    private List<Product> wishlist;

    public void addProduct(Product product){
        wishlist.add(product);
    }

    public void addProductToBasket(Basket basket,Product product){
        basket.addProduct(product);
    }

    public double totalPrice(){
        double totalPrice = 0;
        for (Product product : wishlist) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public Wishlist() {

    }

    public Wishlist(List<Product> basket) {
        this.wishlist = basket;
    }

    public List<Product> getWishlist() throws WishListIsNullException {
        if(wishlist == null){
            throw new WishListIsNullException("Wishlist is null");
        }
        return wishlist;
    }

    public void setWishlist(List<Product> basket) {
        this.wishlist = basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wishlist wishlist1 = (Wishlist) o;
        return Objects.equals(wishlist, wishlist1.wishlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wishlist);
    }

    @Override
    public String toString() {
        if(wishlist == null){
            return "You have not added the product to the wishlist.";
        }
        return "Wishlist{" +
                "wishlist=" + wishlist +
                '}';
    }
}
