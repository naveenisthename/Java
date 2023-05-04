package com.naveen.integer;

import java.util.Scanner;

public class CountDigits {

    public static void countDigit(int number) {
        int count=0;
        for (int i = number; i !=0 ; i/=10) {
            count++;
        }

        System.out.println(count);
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int count=0;

        while(number!=0){
            int singleDigit=number%10;
            number=number/10;
            //count=count+singleDigit; //for add values of the number
            count=count+1; //for count of the number
        }

        System.out.println("Count of an Number is "+count);

        CountDigits.countDigit(12345);

    }
}
