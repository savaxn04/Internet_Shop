package org.example.shop.order;

import org.example.exceptions.UserBlockException;
import org.example.interfaces.ITotalProductsPrice;
import org.example.shop.person.userTypes.Customer;
import org.example.shop.userStorage.Basket;

import java.util.Objects;

public class OrderToHome extends Order implements ITotalProductsPrice {
    private String customerStreet;
    private int customerHouseNumber;

    public OrderToHome(Customer customer, Basket customerBasketList) throws UserBlockException {
        super(customer, customerBasketList);
        if(customer.getStatus().equals("block")){
            throw new UserBlockException("The user has the status of blocking by the administrator");
        }
            this.customerStreet = customer.getStreet();
            this.customerHouseNumber = customer.getHouseNumber();
    }

    public String getCustomerStreet() {
        return customerStreet;
    }

    public void setCustomerStreet(String customerStreet) {
        this.customerStreet = customerStreet;
    }

    public int getCustomerHouseNumber() {
        return customerHouseNumber;
    }

    public void setCustomerHouseNumber(int customerHouseNumber) {
        this.customerHouseNumber = customerHouseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderToHome that)) return false;
        return customerHouseNumber == that.customerHouseNumber && customerStreet.equals(that.customerStreet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerStreet, customerHouseNumber);
    }

    @Override
    public String toString() {
        return "OrderToHome{" + super.toString() +
                "customerStreet='" + customerStreet + '\'' +
                ", customerHouseNumber=" + customerHouseNumber +
                '}';
    }
}
