package org.example.entity;



import org.example.entity.person.staff.Department;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Objects;

public class Shop {
    private static final Logger LOGGER = LogManager.getLogger(Shop.class);
    private String name;
    private String type;

    public List<Department> getDepartments(List<Department> departments){
        LOGGER.info("get departments");
        return departments;
    }

    public Shop() {
    }

    public Shop(String name, String type) {
        this.name = name;
        this.type = type;
        LOGGER.info("shop created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop shop)) return false;
        return name.equals(shop.name) && type.equals(shop.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
