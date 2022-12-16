package org.example.shop.person.staff;

import org.example.interfaces.IEmployeeCheckProductInCategory;
import org.example.shop.person.Person;
import org.example.shop.products.Category;
import org.example.shop.products.Product;

public class Manager extends Person implements IEmployeeCheckProductInCategory {

    private String department;

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

    @Override
    public boolean checkProductInCategory(Product product, Category category) {
        return category.getCategory().contains((Product)product);
    }
}
