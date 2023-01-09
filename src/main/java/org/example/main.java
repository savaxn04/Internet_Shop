package org.example;

import org.example.entity.bankCard.BankCard;
import org.example.entity.order.OrderToHome;
import org.example.entity.person.userTypes.Customer;
import org.example.entity.products.Product;
import org.example.entity.products.productTypes.electroncs.Electronics;
import org.example.entity.receipt.Receipt;
import org.example.entity.userStorage.Basket;
import org.example.exceptions.ReflectionException;
import org.example.reflection.Reflection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.enums.product.electronics.MemoryCapacity;
import org.example.enums.product.electronics.OperatingMemory;
import org.example.enums.product.materials.ElectronicsMaterials;

import java.util.ArrayList;

public class main {
    private static final Logger LOGGER = LogManager.getLogger(main.class);

    public static void main(String args[]) throws ReflectionException {
        Reflection.showReflection();
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
    }
}
