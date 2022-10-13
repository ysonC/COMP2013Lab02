package com.myzoooo;

public class Admin extends Employee{

    public Admin(String name) {
        super();
    }
    @Override
    public int calcChristmasBonus() {
        double bonus = getSalary() * 0.08;
        return 0;
    }
}
