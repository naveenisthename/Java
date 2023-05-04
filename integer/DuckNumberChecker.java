package com.naveen.integer;

import java.util.Scanner;

public class DuckNumberChecker {
    public static void main(String[] args) {

        System.out.println("Enter a Number : ");
        Scanner input = new Scanner(System.in);
        int digit, number = input.nextInt();
        boolean isDuckNumber = false;

        while(number!=0){
            digit=number%10;
            if(digit==0){
                isDuckNumber=true;
                break;
            }
            number=number/10;
        }

        if (isDuckNumber){
            System.out.println("Duck number");
        }else {
            System.out.println("Not an Duck number");
        }
    }
}