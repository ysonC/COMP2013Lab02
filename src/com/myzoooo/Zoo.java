package com.myzoooo;

import java.util.ArrayList;

public class Zoo {
    private String location;
    private int numCompounds;
    public static int numZoos;
    private int zooID;
    private ArrayList<Compound> compounds; //test


    public Zoo(){
        this.location = "Unknown";
        this.numCompounds = 30;
    }

    public Zoo(String location, int numCompounds) {
        numZoos++;
        this.location = location;
        this.numCompounds = numCompounds;
        this.zooID = numZoos;
        compounds = new ArrayList<Compound>();
        for(int i = 0; i < numCompounds; i++){
            addCompound(new Compound(location));
        }
    }

    private void addCompound(Compound compound) {
        this.compounds.add(compound); // add "compound" to the array(compounds)
    }
    public Compound getCompound(int index) {
        return compounds.get(index);
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCompound() {
        return numCompounds;
    }

    public void setCompound(int compounds) {
        this.numCompounds = compounds;
    }

    public void buildNewCompound(){
        this.numCompounds++;
    }
    public int getNumzoo(){return numZoos;}
    public void printInfo(){
        System.out.println("ID : " + this.zooID + " Location : " + this.location + " Compounds : " + this.numCompounds);
    }
}





















