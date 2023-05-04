package com.naveen.oops;

public class Programmer extends Employee  {
     String experiance;
     String domain;

    public Programmer(String name, int age, String experiance,String domain) {
        super(name, age);
        this.experiance = experiance;
        this.domain=domain;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "experiance='" + experiance + '\'' +
                ", domain='" + domain + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void workTime() {
        System.out.println("9 to 6");
    }

    public int salary(int salary){
        return salary;
    }
    public int salary(int salary,int bonus){
        return salary+bonus;
    }
}
