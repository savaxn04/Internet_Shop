package org.example.userTypes;

import org.example.enums.Role;

import java.util.Objects;

public class Customer extends User {
    private int age;
    private String city;
    private String question;

    public Customer() {

    }

    public Customer(String name, String surname, int age, String city) {
        super(name, surname,Role.CUSTOMER);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return age == customer.age && city.equals(customer.city) && Objects.equals(question, customer.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, city, question);
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                " ,age=" + age +
                ", city='" + city + '\'' +
                ", question='" + question + '\'' +
                '}';
    }
}
