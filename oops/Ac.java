package com.naveen.oops;

public class Ac {
    String name;
    int price;
    float weight;

    Ac(String name, int price, float weight) {
        this.name=name;
        this.price=price;
        this.weight=weight;
    }

    public String toString(){
        return name+", "+price+", "+weight;
    }
}
