package com.myzoooo;

import java.util.ArrayList;

public class Compound {
    private String location;
    private ArrayList<Animal> animals;
    private int compoundID;
    public static int numCompounds;

    public Compound(String location){
        this.location = location;
        numCompounds++;
        this.compoundID = numCompounds;
        animals = new ArrayList<Animal>();
    }
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public int getCompoundID() {
        return compoundID;
    }

    public void printCompound(){
        System.out.println("Compound " + this.getCompoundID() + " is at " + this.location + " with " + animals.size() + " animals.");
    }
}
