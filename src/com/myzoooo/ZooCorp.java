package com.myzoooo;

import java.util.ArrayList;

public class ZooCorp {
    private ArrayList<Zoo> zoos;
    private ArrayList<Employee> employees;
    public ZooCorp(Zoo zoo) {
        zoos = new ArrayList<Zoo>();
        employees = new ArrayList<Employee>();
        zoos.add(zoo);
    }


    public void addZoo(Zoo zoo){
        zoos.add(zoo);
    }
    public Zoo getZoo(int index) {
        return zoos.get(index);
    }

    public void addStaff(Employee name) {
        employees.add(name);
    }
}
