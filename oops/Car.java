package com.naveen.oops;

public class Car extends Vehicle{
    private String brand;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String name, int wheels, String brand, int price) {
        super(name, wheels);
        this.brand = brand;
        this.price = price;
    }

    public int discount(int percent){
        return price*percent/100;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public String welcome(){
        return "HI";
    }

    public int calculate(){
        return 100000;
    }

    public int calculate(int price1){
        return price1;
    }
    public int calculate(int price1,int discount){
        return price1-(price1*discount/100);
    }
    public int calculate(int price1,int discount, int tax){
        return (price1-price1*discount/100)+(price1*tax/100);
    }

}
