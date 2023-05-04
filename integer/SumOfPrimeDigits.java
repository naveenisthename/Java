package com.naveen.integer;

import java.util.Scanner;

public class SumOfPrimeDigits {
    public static void main(String[] args) {
        System.out.print("Enter an number : ");
        Scanner input=new Scanner(System.in);
        int digit,sum=0,number =input.nextInt();

        while(number!=0){
            digit=number%10;
            if(digit==2 || digit==3 || digit==5 || digit==7){
                sum=sum+digit;
            }
            number=number/10;
        }

        System.out.println("Sum of Prime digits "+sum);

    }
}
