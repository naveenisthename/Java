package com.naveen.Arrays;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCar {
    public static void main(String[] args) {

        Car car1=new Car("Toyoto",250000,true);
        Car car2=new Car("Tesla",3500000,false);
        Car car3=new Car("nano",150000,true);

        ArrayList<Car> carArrayList=new ArrayList<>();
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);

        Map<Integer,Car> carList= carArrayList.stream().collect(Collectors.toMap(x->x.getPrice()+10000,y->y));

        for(Car z:carArrayList) {
            System.out.println(z);
        }

    }
}
