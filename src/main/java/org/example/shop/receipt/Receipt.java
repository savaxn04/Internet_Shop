package org.example.shop.receipt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.shop.bankCard.BankCard;
import org.example.exceptions.UserStorageIsNullException;
import org.example.exceptions.NameAndSurnameNotMatchWithCardException;
import org.example.shop.order.OrderToHome;
import org.example.shop.order.OrderToPostOffice;
import org.example.shop.person.userTypes.Customer;

import java.util.Objects;

public class Receipt {
    private static final Logger LOGGER = LogManager.getLogger(Receipt.class);
    private final BankCard bankCard;

    public String createReceipt(Receipt receipt, OrderToHome orderToHome) throws UserStorageIsNullException {
        LOGGER.info("creating receipt");
        return receipt.bankCard.getUserName()+ " " + receipt.bankCard.getUserSurname() + " bought " + orderToHome.getCustomerBasketList() + ".\n" + "Total price is: " + orderToHome.totalPrice();
    }

    public String createReceipt(Receipt receipt, OrderToPostOffice orderToPostOffice) throws UserStorageIsNullException {
        LOGGER.info("creating receipt");
        return receipt.bankCard.getUserName()+ " " + receipt.bankCard.getUserSurname() + " bought " + orderToPostOffice.getCustomerBasketList() + ".\n" + "Total price is: " + orderToPostOffice.totalPrice();
    }

    public Receipt(OrderToHome orderToHome, BankCard bankCard) throws NameAndSurnameNotMatchWithCardException {
        if(!orderToHome.getCustomerName().equals(bankCard.getUserName()) && !orderToHome.getCustomerSurname().equals(bankCard.getUserSurname())){
            LOGGER.error("Customer name not equals to bank card user name");
            throw new NameAndSurnameNotMatchWithCardException("Enter valid Name and Surname");
        } else {
            this.bankCard = bankCard;
            LOGGER.info("Receipt to home created");
        }
    }

    public Receipt(OrderToPostOffice orderToPostOffice, BankCard bankCard) throws NameAndSurnameNotMatchWithCardException {
        if(!orderToPostOffice.getCustomerName().equals(bankCard.getUserName()) && !orderToPostOffice.getCustomerSurname().equals(bankCard.getUserSurname())){
            LOGGER.error("Customer name not equals to bank card user name");
            throw new NameAndSurnameNotMatchWithCardException("Enter valid Name and Surname");
        } else {
            LOGGER.info("Receipt to post office created");
            this.bankCard = bankCard;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Receipt receipt)) return false;
        return bankCard.equals(receipt.bankCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankCard);
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "bankCard=" + bankCard +
                '}';
    }
}
