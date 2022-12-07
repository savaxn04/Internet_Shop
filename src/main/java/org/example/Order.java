package org.example;

import org.example.exceptions.BasketIsNullException;
import org.example.exceptions.UserIsBlockException;
import org.example.products.Product;
import org.example.userTypes.Customer;

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
    private int postIndex;
    private int phoneNumber;
    private Basket basketList;

    public double totalPrice() throws BasketIsNullException {
        double totalPrice = 0;
        for (Product product : basketList.getBasket()) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public Order(Customer customer, String street, int houseNumber, int postIndex, int phoneNumber, Basket basketList) throws UserIsBlockException {
        if(customer.getStatus().equals("block")){
            throw new UserIsBlockException("The user has the status of blocking by the administrator");
        }
        else {
            this.name = customer.getName();
            this.surname = customer.getSurname();
            this.age = customer.getAge();
            this.city = customer.getCity();
            this.street = street;
            this.houseNumber = houseNumber;
            this.postIndex = postIndex;
            this.phoneNumber = phoneNumber;
            this.basketList = basketList;
        }

    }
    public Order(Customer customer, String street, int houseNumber, int numberPostOffice, int postIndex, int phoneNumber, Basket basketList) throws UserIsBlockException {
        if(customer.getStatus().equals("block")){
            throw new UserIsBlockException("The user has the status of blocking by the administrator");
        }
        else{
            this.name = customer.getName();
            this.surname = customer.getSurname();
            this.age = customer.getAge();
            this.city = customer.getCity();
            this.street = street;
            this.houseNumber = houseNumber;
            this.numberPostOffice = numberPostOffice;
            this.postIndex = postIndex;
            this.phoneNumber = phoneNumber;
            this.basketList = basketList;
        }

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getNumberPostOffice() {
        return numberPostOffice;
    }

    public int getPostIndex() {
        return postIndex;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public List<Product> getBasket() throws BasketIsNullException {
        if(basketList != null){
            return basketList.getBasket();
        }
        else{
            throw new BasketIsNullException("Basket is null");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        if (!super.equals(o)) return false;
        return age == order.age && houseNumber == order.houseNumber && numberPostOffice == order.numberPostOffice && postIndex == order.postIndex && phoneNumber == order.phoneNumber && name.equals(order.name) && surname.equals(order.surname) && city.equals(order.city) && street.equals(order.street) && basketList.equals(order.basketList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, surname, age, city, street, houseNumber, numberPostOffice, postIndex, phoneNumber, basketList);
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
                ", index=" + postIndex +
                ", phoneNumber=" + phoneNumber +
                ", basketList=" + basketList +
                '}';
    }
}
