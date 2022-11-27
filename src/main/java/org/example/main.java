package org.example;

import org.example.products.Product;
import org.example.userTypes.User;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String args[])
    {
        User firstUser = new User("Dmytro", "Savchenko", 18, "Kyiv");
        BankCard bankCard = new BankCard("Dmytro", "Savchenko", 100000000, "0226", 456);
        Product laptop = new Product("laptop", 21.5);
        Product laptop2 = new Product("laptop2", 22.5);
        List<Product> laptops = new ArrayList<>();
        laptops.add(laptop);
        laptops.add(laptop2);
        Basket user1Basket = new Basket();
        user1Basket.setBasket(laptops);
        user1Basket.addProduct(laptop);
        Wishlist wishList = new Wishlist(laptops);
        wishList.addProductToBasket(user1Basket, wishList.getWishlist().get(1));
        Order firstOrder = new Order(firstUser, "Metalistiv", 5, 173, 39622, 635575702, user1Basket);
        Receipt receipt = new Receipt(firstOrder, bankCard);
        System.out.println(receipt.createReceipt(receipt, firstOrder));
    }
}
