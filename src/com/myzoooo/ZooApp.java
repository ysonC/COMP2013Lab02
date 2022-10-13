package com.myzoooo;

public class ZooApp {

    public static void main(String[] args) {
        Zoo.numZoos = 0;
        Zoo london = new Zoo("London", 24);
        Zoo tokyo = new Zoo("Tokyo", 25);
        Zoo newyork = new Zoo("NewYork", 21);
        Zoo paris = new Zoo("Paris", 20);
        Zoo beeston = new Zoo("Beeston", 26);

        london.printInfo();
        tokyo.printInfo();
        newyork.printInfo();
        paris.printInfo();
        beeston.printInfo();
        System.out.print("Number of Zoo:" + Zoo.numZoos);
    }
}
