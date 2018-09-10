package ru.java.oop.example.shop.service;

import ru.java.oop.example.shop.interfaces.DepartmentInterface;
import ru.java.oop.example.shop.interfaces.EmployeeInterface;

public abstract class AbstractEmployee implements EmployeeInterface {

    public AbstractEmployee() {
    }

    public AbstractEmployee(String name) {
        this.name = name;
    }

    private String name;
    private DepartmentInterface department;
    private boolean free;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(DepartmentInterface department) {
        this.department = department;
    }

    @Override
    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
