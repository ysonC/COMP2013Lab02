package com.myzoooo;

public class ZooKeeper extends Employee{
    public ZooKeeper(String name) {
        super();
    }

    @Override
    public int calcChristmasBonus() {
        double bonus = getSalary() * 0.05 + 100;
        return 0;
    }
}
