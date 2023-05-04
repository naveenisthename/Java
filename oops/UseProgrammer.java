package com.naveen.oops;

public class UseProgrammer {
    public static void main(String[] args) {
        Programmer pro=new Programmer("Surya",22,"1 year","JAVA");

        System.out.println(pro);

        pro.wake();
        pro.sleep();
        pro.workTime();
        System.out.println(pro.leave(7));
        System.out.println(pro.salary(500000,150000));

    }
}
