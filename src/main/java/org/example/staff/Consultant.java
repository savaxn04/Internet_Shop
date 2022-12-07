package org.example.staff;

import org.example.products.Category;
import org.example.products.Product;

public class Consultant extends Employee implements IEmployeeAction {
    private String department;

    @Override
    public boolean checkProductInCategory(Product product, Category category) {
        return IEmployeeAction.super.checkProductInCategory(product, category);
    }

    public Consultant() {
    }

    public Consultant(String name, String surname, String department) {
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
