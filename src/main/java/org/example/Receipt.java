package org.example;

import org.example.userTypes.User;

import java.util.Objects;

public class Receipt{
    private final BankCard bankCard;

    public String createReceipt(Receipt receipt, Order order){
        return receipt.bankCard.getUserName()+ " " + receipt.bankCard.getUserSurname() + " bought " + order.getBasket() + ".\n" + "Total price is: " + order.totalPrice();
    }

    public Receipt(Order order, BankCard bankCard) {
        if(!order.getName().equals(bankCard.getUserName()) && !order.getSurname().equals(bankCard.getUserSurname())){
            throw new IllegalArgumentException("Enter valid Name and Surname");
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
