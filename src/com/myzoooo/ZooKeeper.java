package com.myzoooo;

public class ZooKeeper extends Employee{
    public ZooKeeper(String name) {
        super(name);
    }

    @Override
    public int calcChristmasBonus() {
        return (int) (getSalary() * 0.05 + 100);

    }
}
