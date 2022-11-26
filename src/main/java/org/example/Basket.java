package org.example;

import org.example.products.Product;

import java.util.List;
import java.util.Objects;

public class Basket {
    private List<Product> basket;
    public void addProduct(Product product){
        basket.add(product);
    }

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

    public List<Product> getBasket() {
        if(basket == null){
            throw new NullPointerException(
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
