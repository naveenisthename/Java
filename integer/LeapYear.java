package com.naveen.integer;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter an Year : ");
        Scanner input=new Scanner(System.in);
        int year =input.nextInt();

        if ((year % 400) == 0) {
            System.out.println(year+" is a Leap year");
        }else {
            System.out.println(year+" is not a Leap year");
        }
    }
}
