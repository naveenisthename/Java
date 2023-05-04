package com.naveen.integer;

import java.util.Scanner;

public class PerfectNumber {

    //Perfect Number : a number which equals to its sum of divisible numbers.
    public static void main(String[] args) {
        System.out.println("Enter an Number : ");
        Scanner input =new Scanner(System.in);
        int number=input.nextInt();
        System.out.println(checkPerfect(number));

    }

    public static boolean checkPerfect(int number) {

        int digit;
        int sum=0;

        for (int i = 1; i < number; i++) {
            if (number%i==0){
              sum=sum+i;
            }
        }
        return sum==number;
    }

}
