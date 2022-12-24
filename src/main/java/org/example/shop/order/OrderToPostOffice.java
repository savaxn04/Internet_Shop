package org.example.shop.order;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.enums.user.UserStatus;
import org.example.exceptions.UserBlockException;
import org.example.shop.person.userTypes.Customer;
import org.example.shop.userStorage.Basket;

import java.util.Objects;

public class OrderToPostOffice extends Order {
    private static final Logger logger = LogManager.getLogger(OrderToPostOffice.class);
    private int customerNumberPostOffice;
    private int customerPostIndex;

    public OrderToPostOffice(Customer customer, Basket customerBasketList) throws UserBlockException {
        super(customer, customerBasketList);
        if(customer.getStatus().equals(UserStatus.BLOCK)) {
            throw new UserBlockException("The user has the status of blocking by the administrator");
        }
        this.customerNumberPostOffice = customer.getNumberPostOffice();
        this.customerPostIndex = customer.getPostIndex();
        logger.info("Order to post office created");
    }

    public int getCustomerNumberPostOffice() {
        return customerNumberPostOffice;
    }

    public void setCustomerNumberPostOffice(int customerNumberPostOffice) {
        this.customerNumberPostOffice = customerNumberPostOffice;
    }

    public int getCustomerPostIndex() {
        return customerPostIndex;
    }

    public void setCustomerPostIndex(int customerPostIndex) {
        this.customerPostIndex = customerPostIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderToPostOffice that)) return false;
        return customerNumberPostOffice == that.customerNumberPostOffice && customerPostIndex == that.customerPostIndex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerNumberPostOffice, customerPostIndex);
    }

    @Override
    public String toString() {
        return "OrderToPostOffice{" + super.toString() +
                "customerNumberPostOffice=" + customerNumberPostOffice +
                ", customerPostIndex=" + customerPostIndex +
                '}';
    }
}
