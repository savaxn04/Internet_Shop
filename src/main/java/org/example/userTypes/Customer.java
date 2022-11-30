package org.example.userTypes;

import org.example.Role;

import java.util.Map;
import java.util.Objects;

public class Customer extends User {
    private int age;
    private String city;
    private String question;

    public Customer() {

    }

    public Customer(String name, String surname, String status, int age, String city) {
        super(name, surname, status,Role.CUSTOMER);
        this.age = age;
        this.city = city;
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
