package com.naveen.oops;

public class Address {
    int number;
    String street;
    String area;

    Address(int number,String street,String area){
        this.number=number;
        this.street=street;
        this.area=area;
    }
    Address(){
        this.number=number;
        this.street=street;
        this.area=area;
    }

    public String toString(){
        return number+", "+street+", "+area;
    }




}
