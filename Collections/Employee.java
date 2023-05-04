package com.naveen.Collections;

public class Employee {
    private String name;
    private int age;
    private String dept;
    private int salary;

    public void set(String name){
        this.name=name;
    }
    public String getName(String name){
        return name;
    }

    public void setName(int age){
        this.age=age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge(int age ){
        return age;
    }


    Employee(String name, int age, String dept, int salary){
        this.name=name;
        this.age=age;
        this.dept=dept;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }


}
