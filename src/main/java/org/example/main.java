package org.example;

import org.example.enums.product.electronics.MemoryCapacity;
import org.example.enums.product.electronics.OperatingMemory;
import org.example.enums.product.materials.ElectronicsMaterials;
import org.example.shop.bankCard.BankCard;
import org.example.shop.order.Order;
import org.example.shop.order.OrderToHome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.shop.person.userTypes.Customer;
import org.example.shop.person.userTypes.Seller;
import org.example.shop.person.userTypes.User;
import org.example.shop.products.Product;
import org.example.shop.products.productTypes.electroncs.Electronics;
import org.example.shop.receipt.Receipt;
import org.example.shop.userStorage.Basket;

import java.util.ArrayList;
import java.util.List;

public class main {
    private static final Logger LOGGER = LogManager.getLogger(main.class);

    public static void main(String args[]){
        Customer firstUser = new Customer("Dmytro", "Savchenko", 18, "Kremenchuk", "Lesi Ukrayinky", 18, 14, 39622, 635575702);
        Electronics laptop = new Electronics("laptop", 42000, 1, "Laptop", MemoryCapacity.FIVE_HUNDRED_TWELVE, OperatingMemory.SIXTEEN, ElectronicsMaterials.PLASTIC);
        LOGGER.info(laptop.getPrice());
        ArrayList<Product> products = new ArrayList<>();
        products.add(laptop);
        Basket basketForUser1 = new Basket(products);
        LOGGER.info(basketForUser1.totalPrice());
        BankCard bankCard = new BankCard("Dmytro", "Savchenko", 123456, 2022, 2, 422, 100000);
        OrderToHome orderToHome = new OrderToHome(firstUser, basketForUser1);
        Receipt receipt1 = new Receipt(orderToHome, bankCard);
        LOGGER.info(bankCard.getMoney());
        LOGGER.info(receipt1.createReceipt(receipt1, orderToHome));
        LOGGER.info(firstUser.makePurchase(receipt1, orderToHome, bankCard));
        LOGGER.info(bankCard.getMoney());
    }
}
