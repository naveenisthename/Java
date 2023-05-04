package com.naveen.integer;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        System.out.print("Enter an Number : ");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();

        int n1=0,n2=1,n3;

        for (int i = 2; i < number; i++) {
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }

        }
}
