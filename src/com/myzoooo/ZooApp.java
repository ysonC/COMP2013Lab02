package com.myzoooo;

public class ZooApp {

    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        Zoo zoo2 = new Zoo("Taiwan", 25);

        zoo1.printInfo();
        zoo2.printInfo();
    }
}
