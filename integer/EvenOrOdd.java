package com.naveen.integer;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Enter an Number : ");
        try(Scanner input=new Scanner(System.in);) {
            int number = input.nextInt();

            if (number <= 0) {
                 throw new IllegalArgumentException("Invalid Number "+number);
            } else {
                if (number % 2 == 0 ) {
                    System.out.println("Even Number");
                } else if (number % 3==0 ) {
                    System.out.println("Odd Number");
                } else {
                    System.out.println("Please enter an number greater than 0");
                }
            }
        }
    }


}


