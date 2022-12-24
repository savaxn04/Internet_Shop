package org.example.shop.person.staff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.interfaces.IEmployeeCheckProductInCategory;
import org.example.main;
import org.example.shop.person.Person;
import org.example.shop.products.Category;
import org.example.shop.products.Product;

public class Consultant extends Person implements IEmployeeCheckProductInCategory {
    private static final Logger LOGGER = LogManager.getLogger(Consultant.class);
    private String department;

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

    @Override
    public boolean checkProductInCategory(Product product, Category category) {
        LOGGER.info("Check product in category by consultant");
        return category.getCategory().contains(product);
    }
}
