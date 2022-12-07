package org.example.staff;

import org.example.products.Category;
import org.example.products.Product;

import java.util.Objects;

public class Manager extends Employee implements IEmployeeAction{
    private String department;

    public boolean checkProductInCategory(Product product, Category category) {
        return IEmployeeAction.super.checkProductInCategory(product, category);
    }

    public Manager() {
    }

    public Manager(String name, String surname, String department) {
        super(name, surname);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
