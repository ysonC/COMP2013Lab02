package com.myzoooo;

public class Admin extends Employee{
    public Admin(String name) {
        super(name);
    }
    @Override
    public int calcChristmasBonus() {
        return (int) (getSalary() * 0.08);
    }
}
