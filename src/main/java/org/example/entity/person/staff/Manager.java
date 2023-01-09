package org.example.entity.person.staff;

import org.example.entity.products.Category;
import org.example.entity.products.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.interfaces.IEmployeeCheckProductInCategory;
import org.example.entity.person.Person;

public class Manager extends Person implements IEmployeeCheckProductInCategory {
    private static final Logger LOGGER = LogManager.getLogger(Manager.class);

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
        LOGGER.info("Check product in category by manager");
        return category.getCategory().contains((Product)product);
    }
}
