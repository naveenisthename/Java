package com.naveen.Arrays;

public class Car {
    String brand;
    int price;
    boolean isPetrol;

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

    public boolean isPetrol() {
        return isPetrol;
    }

    public void setPetrol(boolean petrol) {
        isPetrol = petrol;
    }

    public Car(String brand, int price, boolean isPetrol) {
        this.brand = brand;
        this.price = price;
        this.isPetrol = isPetrol;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", isPetrol=" + isPetrol +
                '}';
    }
}
