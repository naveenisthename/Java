package com.naveen.integer;

import java.util.Scanner;

public class NivenNumber {
    public static void main(String[] args) {

        //Niven Number : A number divisible by its sum of digits.

        System.out.print("Enter an Number : ");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        System.out.println(number%sum(number)==0?"Niven number":"Not an Niven number");
    }

    public static int sum(int number){

        int sum=0;

        while(number!=0){
            int digit=number%10;
            sum=sum+digit;
            number=number/10;

        }
        return sum;
    }
}
