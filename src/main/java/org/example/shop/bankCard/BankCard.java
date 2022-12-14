package org.example.shop.bankCard;

import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class BankCard {
    private String userName;
    private String userSurname;
    private long cardNumber;
    private String yearMonth;
    private int cvv;

    public BankCard(String userName, String userSurname, long cardNumber, String yearMonth, int cvv) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.cardNumber = cardNumber;
        this.yearMonth = String.valueOf(YearMonth.parse(yearMonth, DateTimeFormatter.ofPattern("MMyy").withZone(ZoneId.of("UTC"))));
        this.cvv = cvv;
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

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = String.valueOf(YearMonth.parse(yearMonth, DateTimeFormatter.ofPattern("MMyy").withZone(ZoneId.of("UTC"))));
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankCard bankCard)) return false;
        return cardNumber == bankCard.cardNumber && cvv == bankCard.cvv && userName.equals(bankCard.userName) && userSurname.equals(bankCard.userSurname) && yearMonth.equals(bankCard.yearMonth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userSurname, cardNumber, yearMonth, cvv);
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", cardNumber=" + cardNumber +
                ", yearMonth=" + yearMonth +
                ", cvv=" + cvv +
                '}';
    }
}
