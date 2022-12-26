package org.example.shop.userStorage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.exceptions.UserStorageIsNullException;
import org.example.interfaces.IActionWithProductInStorage;
import org.example.interfaces.ITotalProductsPrice;
import org.example.shop.products.Product;

import java.util.List;
import java.util.Objects;

public class Basket implements ITotalProductsPrice, IActionWithProductInStorage {
    private static final Logger LOGGER = LogManager.getLogger(Basket.class);
    private List<Product> basket;

    @Override
    public void addProduct(Product product){
        basket.add(product);
        LOGGER.info("product added to basket");
    }

    @Override
    public void removeProduct(Product product){
        basket.remove(product);
        LOGGER.info("Product removed from product list");
    }

    @Override
    public double totalPrice(){
        double totalPrice = 0;
        for (Product product : basket) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public Basket() {
    }

    public Basket(List<Product> basket) {
        this.basket = basket;
    }

    public List<Product> getBasket() throws UserStorageIsNullException {
        if(basket == null){
            throw new UserStorageIsNullException(
                    "The provided basket was null. You need to add the product to the basket.");
        }
        return basket;
    }

    public void setBasket(List<Product> basket) {
        this.basket = basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket1 = (Basket) o;
        return Objects.equals(basket, basket1.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basket);
    }

    @Override
    public String toString() {
        if(basket == null){
            return "You have not added the product to the basket.";
        }
        return "Basket{" +
                "basket=" + basket +
                '}';
    }
}
