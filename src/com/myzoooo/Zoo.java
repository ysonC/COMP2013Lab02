package com.myzoooo;

public class Zoo {
    private String location;
    private int compounds;


    public Zoo(){
        this.location = "Unknown";
        this.compounds = 30;
    }

    public Zoo(String location, int compounds) {
        this.location = location;
        this.compounds = compounds;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCompound() {
        return compounds;
    }

    public void setCompound(int compounds) {
        this.compounds = compounds;
    }

    public void buildNewCompound(){
        this.compounds++;
    }

    public void printInfo(){
        System.out.println("Location : " + this.location + " Compounds : " + this.compounds);
    }
}





















