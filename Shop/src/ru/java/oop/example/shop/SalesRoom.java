package ru.java.oop.example.shop;

import ru.java.oop.example.shop.interfaces.DepartmentInterface;
import ru.java.oop.example.shop.interfaces.VisitorInterface;

import java.util.ArrayList;

public class SalesRoom {

    public static final String SHOP_NAME = "technodom";

    private ArrayList<DepartmentInterface> departmentList = new ArrayList<DepartmentInterface>();// в каждом департаменте имеются свои сотрудники

    private ArrayList<VisitorInterface> visitorList = new ArrayList<VisitorInterface>();

    public ArrayList<DepartmentInterface> getDepartmentList() {
        return departmentList;
    }

    public void addDepartment(DepartmentInterface department){
        departmentList.add(department);
    }

    public void addVisitor(VisitorInterface visitor){
        visitorList.add(visitor);
    }

}
