package com.naveen.oops;

public class UseCar {
    public static void main(String[] args) {
        Car car=new Car("Car",4,"Nano",100000);
        car.setName("Carr");
        car.setWheels(4);
        car.setBrand("Audi");
        car.setPrice(100000);

        System.out.println(car.getName()+", "+car.getWheels()+", "+car.getBrand()+", "+car.getPrice()+", "+car.discount(10));

        Vehicle vehicle=new Vehicle("Four wheelar",4);
        System.out.println(vehicle+", "+car);
        System.out.println(car.welcome());
        System.out.println(car.calculate());
        System.out.println(car.calculate(500000));
        System.out.println(car.calculate(500000,3));
        System.out.println(car.calculate(500000,3,2));


    }
}
