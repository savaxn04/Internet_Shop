package org.example;

import org.example.staff.Director;

import java.util.Objects;

public class Shop{
    private String name;
    private String type;

    public Shop(String name, String type) {
        this.name = name;
        this.type = type;
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
