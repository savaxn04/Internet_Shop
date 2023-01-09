package org.example.entity.bankCard;

import org.example.exceptions.NotEnoughMoneyOnCardException;
import org.example.entity.order.OrderToHome;

import java.util.Objects;

public class BankCard {
    private String userName;
    private String userSurname;
    private long cardNumber;
    private int year;
    private int month;
    private int cvv;
    private double money;

    public String makePayment(OrderToHome orderToHome){
        if((this.money - orderToHome.totalPrice() > 0)){
            this.money -= orderToHome.totalPrice();
            return "Successful payment";
        }
        else {
            throw new NotEnoughMoneyOnCardException("Not enough money on the card");
        }

    }

    public BankCard(String userName, String userSurname, long cardNumber, int year, int month, int cvv, double money) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.cardNumber = cardNumber;
        this.year = year;
        this.month = month;
        this.cvv = cvv;
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public double getMoney() {
        return money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankCard bankCard)) return false;
        return cardNumber == bankCard.cardNumber && cvv == bankCard.cvv && Double.compare(bankCard.money, money) == 0 && userName.equals(bankCard.userName) && userSurname.equals(bankCard.userSurname) && year == bankCard.year && month == bankCard.month;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userSurname, cardNumber, year, month, cvv, money);
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", cardNumber=" + cardNumber +
                ", year='" + year + '\'' +
                ", month='" + month +
                ", cvv=" + cvv +
                ", money=" + money +
                '}';
    }
}
