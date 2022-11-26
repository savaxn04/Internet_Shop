package org.example;

import org.example.products.Product;
import org.example.userTypes.User;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String args[])
    {
        User firstUser = new User("Dmytro", "Savchenko", 18, "Kyiv");
        Product laptop = new Product("laptop", 21.5);
        Product laptop2 = new Product("laptop2", 22.5);
        List<Product> laptops = new ArrayList<>();
        laptops.add(laptop);
        laptops.add(laptop2);
        Basket user1Basket = new Basket();
        user1Basket.setBasket(laptops);
        user1Basket.addProduct(laptop);
        for (Product product: user1Basket.getBasket()) {
            System.out.println(product);
        }
        Wishlist wishList = new Wishlist(laptops);
        wishList.addProductToBasket(user1Basket, wishList.getWishlist().get(1));
        /*System.out.println("112322222222222222222222222222222");
        for (Product product: user1Basket.getBasket()) {
            System.out.println(product);
        }*/
        Order firstOrder = new Order(firstUser, "Metalistiv", 5, 173, 39622, 635575702, user1Basket);
        System.out.println(firstOrder);
    }
}
