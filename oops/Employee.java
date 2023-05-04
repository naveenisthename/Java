package com.naveen.oops;

public abstract class Employee implements Human {
    @Override
    public void wake() {
        System.out.println("6:00 CLOCK");
    }

    @Override
    public void sleep() {
        System.out.println("11:00 CLOCK");
    }

    public abstract void workTime();
 public String leave(int day){
     if (1>6) {
         return "lot leave";
     }else {
         return "leave";
     }

 }
 public String name;
 public int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
