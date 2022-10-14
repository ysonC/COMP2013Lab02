package com.myzoooo;

public abstract class Employee implements Employable{
    private String name;
    private int salary;

    public Employee(String name){
        setEmployeeName(name);
        setSalary(1000);
    }

    @Override
    public void setEmployeeID(int number) {

    }

    @Override
    public int getEmployeeID() {
        return 0;
    }

    @Override
    public void setEmployeeName(String name) {
        this.name = name;
    }

    @Override
    public String getEmployeeName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
