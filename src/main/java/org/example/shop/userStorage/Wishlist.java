package org.example.shop.userStorage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.exceptions.UserStorageIsNullException;
import org.example.interfaces.ITotalProductsPrice;
import org.example.shop.products.Category;
import org.example.shop.products.Product;

import java.util.List;
import java.util.Objects;

public class Wishlist implements ITotalProductsPrice {
    private static final Logger logger = LogManager.getLogger(Wishlist.class);
    private List<Product> wishlist;

    public void addProduct(Product product){
        logger.info("Product added to wishlist");
        wishlist.add(product);
    }

    public void addProductToBasket(Basket basket,Product product){
        logger.info("Product from basket added to wishlist");
        basket.addProduct(product);
    }

    @Override
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

    public List<Product> getWishlist() throws UserStorageIsNullException {
        if(wishlist == null){
            throw new UserStorageIsNullException("Wishlist is null");
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
