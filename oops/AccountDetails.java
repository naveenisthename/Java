package com.naveen.oops;

public class AccountDetails {
    private String name;
    private long accNum;
    private Address address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public long getAccNum(){
        return accNum;
    }
    public void setAccNum(long accNum){
        this.accNum=accNum;
    }
    public Address getAddress(){
        return address;
    }
    public void setAddress(Address address){
        this.address=address;
    }

    AccountDetails(String name,long accNum,Address address){
        this.name=name;
        this.accNum=accNum;
        this.address=address;
    }

    AccountDetails(){
        this.name=name;
        this.accNum=accNum;
        this.address=address;
    }

    public String toString() {
        return name+", "+accNum+", "+address;
    }




}
