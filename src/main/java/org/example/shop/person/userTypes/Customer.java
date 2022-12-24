package org.example.shop.person.userTypes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.enums.user.Role;
import org.example.enums.user.UserStatus;

import java.util.Objects;

public class Customer extends User{
    private static final Logger logger = LogManager.getLogger(Customer.class);
    private int age;
    private String city;
    private String street;
    private int houseNumber;
    private int numberPostOffice;
    private int postIndex;
    private int phoneNumber;
    private String question;

    public Customer() {
        logger.info("Customer created");
    }

    public Customer(String name, String surname, int age, String city, String street, int houseNumber, int numberPostOffice, int postIndex, int phoneNumber) {
        super(name, surname, Role.CUSTOMER, UserStatus.NORMAL);
        this.age = age;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.numberPostOffice = numberPostOffice;
        this.postIndex = postIndex;
        this.phoneNumber = phoneNumber;
        logger.info("Customer created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getNumberPostOffice() {
        return numberPostOffice;
    }

    public void setNumberPostOffice(int numberPostOffice) {
        this.numberPostOffice = numberPostOffice;
    }

    public int getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(int postIndex) {
        this.postIndex = postIndex;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return age == customer.age && houseNumber == customer.houseNumber && numberPostOffice == customer.numberPostOffice && postIndex == customer.postIndex && phoneNumber == customer.phoneNumber && city.equals(customer.city) && street.equals(customer.street) && question.equals(customer.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, city, street, houseNumber, numberPostOffice, postIndex, phoneNumber, question);
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "age=" + age +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", numberPostOffice=" + numberPostOffice +
                ", postIndex=" + postIndex +
                ", phoneNumber=" + phoneNumber +
                ", question='" + question + '\'' +
                '}';
    }
}
