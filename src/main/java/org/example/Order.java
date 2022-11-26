package org.example;



import org.example.products.Product;
import org.example.userTypes.User;
import org.example.Basket;

import java.util.List;
import java.util.Objects;

public class Order extends Basket {
    private String name;
    private String surname;
    private int age;
    private String city;
    private String street;
    private int houseNumber;
    private int numberPostOffice;
    private int index;
    private int phoneNumber;
    private Basket basketList;

    public Order(User user, String street, int houseNumber, int index, int phoneNumber, Basket basketList) {
        this.name = user.getName();
        this.surname = user.getSurname();
        this.age = user.getAge();
        this.city = user.getCity();
        this.street = street;
        this.houseNumber = houseNumber;
        this.index = index;
        this.phoneNumber = phoneNumber;
        this.basketList = basketList;
    }
    public Order(User user, String street, int houseNumber, int numberPostOffice, int index, int phoneNumber, Basket basketList) {
        this.name = user.getName();
        this.surname = user.getSurname();
        this.age = user.getAge();
        this.city = user.getCity();
        this.street = street;
        this.houseNumber = houseNumber;
        this.numberPostOffice = numberPostOffice;
        this.index = index;
        this.phoneNumber = phoneNumber;
        this.basketList = basketList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        if (!super.equals(o)) return false;
        return age == order.age && houseNumber == order.houseNumber && numberPostOffice == order.numberPostOffice && index == order.index && phoneNumber == order.phoneNumber && name.equals(order.name) && surname.equals(order.surname) && city.equals(order.city) && street.equals(order.street) && basketList.equals(order.basketList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, surname, age, city, street, houseNumber, numberPostOffice, index, phoneNumber, basketList);
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", numberPostOffice=" + numberPostOffice +
                ", index=" + index +
                ", phoneNumber=" + phoneNumber +
                ", basketList=" + basketList +
                '}';
    }
}
