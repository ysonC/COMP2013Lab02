package com.myzoooo;

public class ZooApp {

    public static void main(String[] args) {
        Zoo.numZoos = 0;
        Zoo london = new Zoo("London", 24);
        Zoo tokyo = new Zoo("Tokyo", 25);
        ZooCorp megagZoo = new ZooCorp(london);
        megagZoo.addZoo(tokyo);
        Zoo newyork = new Zoo("NewYork", 21);
        Zoo paris = new Zoo("Paris", 20);
        Zoo beeston = new Zoo("Beeston", 26);
        Employee sue = new ZooKeeper("Sue");
        Employee bob = new Admin("Bob");
        megagZoo.addStaff(sue);
        megagZoo.addStaff(bob);
        Compound compound1 = london.getCompound(1);
        compound1.addAnimal(new Animal());
        compound1.printCompound();
        london.printInfo();
        tokyo.printInfo();
        newyork.printInfo();
        paris.printInfo();
        beeston.printInfo();
        System.out.println("Number of Zoo:" + Zoo.numZoos);
        System.out.println(sue.getClass().getSimpleName() + " : " + sue.getEmployeeName()+" : " + sue.calcChristmasBonus());
    }
}
