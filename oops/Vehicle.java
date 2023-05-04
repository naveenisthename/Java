package com.naveen.oops;

public class Vehicle {
    private String name;
    private int wheels;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public Vehicle(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    public String welcome(){
        return "HI";
    }

}
