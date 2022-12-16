package org.example.shop.receipt;

import org.example.shop.bankCard.BankCard;
import org.example.exceptions.UserStorageIsNullException;
import org.example.exceptions.NameAndSurnameNotMatchWithCardException;
import org.example.shop.order.OrderToHome;
import org.example.shop.order.OrderToPostOffice;

import java.util.Objects;

public class Receipt {
    private final BankCard bankCard;

    public String createReceipt(Receipt receipt, OrderToHome orderToHome) throws UserStorageIsNullException {
        return receipt.bankCard.getUserName()+ " " + receipt.bankCard.getUserSurname() + " bought " + orderToHome.getCustomerBasketList() + ".\n" + "Total price is: " + orderToHome.totalPrice();
    }

    public String createReceipt(Receipt receipt, OrderToPostOffice orderToPostOffice) throws UserStorageIsNullException {
        return receipt.bankCard.getUserName()+ " " + receipt.bankCard.getUserSurname() + " bought " + orderToPostOffice.getCustomerBasketList() + ".\n" + "Total price is: " + orderToPostOffice.totalPrice();
    }

    public Receipt(OrderToHome orderToHome, BankCard bankCard) throws NameAndSurnameNotMatchWithCardException {
        if(!orderToHome.getCustomerName().equals(bankCard.getUserName()) && !orderToHome.getCustomerSurname().equals(bankCard.getUserSurname())){
            throw new NameAndSurnameNotMatchWithCardException("Enter valid Name and Surname");
        } else {
            this.bankCard = bankCard;
        }
    }

    public Receipt(OrderToPostOffice orderToPostOffice, BankCard bankCard) throws NameAndSurnameNotMatchWithCardException {
        if(!orderToPostOffice.getCustomerName().equals(bankCard.getUserName()) && !orderToPostOffice.getCustomerSurname().equals(bankCard.getUserSurname())){
            throw new NameAndSurnameNotMatchWithCardException("Enter valid Name and Surname");
        } else {
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