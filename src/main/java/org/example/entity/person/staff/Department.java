package org.example.entity.person.staff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Objects;

public class Department {
    private static final Logger LOGGER = LogManager.getLogger(Department.class);
    private final String name;
    private List<Manager> managerList;
    private List<Consultant> consultantList;

    public void addManager(Manager manager){
        managerList.add(manager);
    }

    public void addConsultant(Consultant consultant){
        consultantList.add(consultant);
    }

    public void removeManager(Manager manager){
        managerList.remove(manager);
    }

    public void removeConsultant(Consultant consultant){
        consultantList.remove(consultant);
    }

    public Department(String name, List<Manager> managerList, List<Consultant> consultantList) {
        this.name = name;
        this.managerList = managerList;
        this.consultantList = consultantList;
    }

    public Department(String name) {
        this.name = name;
    }

    public void setConsultantManager(List<Consultant> consultantList) {
        LOGGER.info("Set manager list");
        this.consultantList = consultantList;
    }

    public void setManagerList(List<Manager> managerList) {
        LOGGER.info("Set manager list");
        this.managerList = managerList;
    }

    public String getName() {
        return name;
    }

    public List<Manager> getManagerList() {
        return managerList;
    }

    public List<Consultant> getConsultantList() {
        return consultantList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;
        return name.equals(that.name) && Objects.equals(managerList, that.managerList) && Objects.equals(consultantList, that.consultantList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, managerList, consultantList);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", managerList=" + managerList +
                ", consultantManager=" + consultantList +
                '}';
    }
}
