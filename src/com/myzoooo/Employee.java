package com.myzoooo;

public abstract class Employee implements Employable{
    private String name;
    public Employee(){

    }
    public Employee(String name){
        setEmployeeName(name);
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
        return null;
    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public void setSalary(int salary) {

    }
}
