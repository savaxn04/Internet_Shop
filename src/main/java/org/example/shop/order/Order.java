package org.example.shop.order;

import org.example.exceptions.UserStorageIsNullException;
import org.example.interfaces.ITotalProductsPrice;
import org.example.shop.person.userTypes.Customer;
import org.example.shop.products.Product;
import org.example.shop.userStorage.Basket;

import java.util.Objects;

public abstract class Order implements ITotalProductsPrice  {
    private String customerName;
    private String customerSurname;
    private int customerAge;
    private String customerCity;
    private int customerPhoneNumber;
    private Basket customerBasketList;

    @Override
    public Double totalPrice() throws UserStorageIsNullException {
        return getCustomerBasketList().getBasket()
                .stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public Order() {
    }

    public Order(Customer customer, Basket customerBasketList) {
        this.customerName = customer.getName();
        this.customerSurname = customer.getSurname();
        this.customerAge = customer.getAge();
        this.customerCity = customer.getCity();
        this.customerPhoneNumber = customer.getPhoneNumber();
        this.customerBasketList = customerBasketList;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Basket getCustomerBasketList() {
        return customerBasketList;
    }

    public void setCustomerBasketList(Basket customerBasketList) {
        this.customerBasketList = customerBasketList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return customerAge == order.customerAge && customerPhoneNumber == order.customerPhoneNumber && customerName.equals(order.customerName) && customerSurname.equals(order.customerSurname) && customerCity.equals(order.customerCity) && customerBasketList.equals(order.customerBasketList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, customerSurname, customerAge, customerCity, customerPhoneNumber, customerBasketList);
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", customerSurname='" + customerSurname + '\'' +
                ", customerAge=" + customerAge +
                ", customerCity='" + customerCity + '\'' +
                ", customerPhoneNumber=" + customerPhoneNumber +
                ", customerBasketList=" + customerBasketList +
                '}';
    }
}
