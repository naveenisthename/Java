package com.naveen.integer;

import java.util.Scanner;

public class SpecialTwoDigitChecker {
    public static void main(String[] args) {

        //SpecialTwoDigit : a number equals to sum of its two digits sum and mul.
        System.out.print("Enter an two digit number : ");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();

                int result=0;

                    int digit1 = number % 10;
                    int digit2 = number / 10;
                    result = (digit1 + digit2) + (digit1 * digit2);



        System.out.println(result==number?"Special  number ": "Not an Special  number");
                }
}
