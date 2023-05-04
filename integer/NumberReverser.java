package com.naveen.integer;

import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        System.out.print("Enter an number : ");
        Scanner input=new Scanner(System.in);
        int digit,number=input.nextInt();
        int result=0;

        while(number!=0) {
             digit = number % 10;
            result = result * 10 + digit;
            number = number / 10;
        }
            System.out.println(result);
            input.close();
    }
}
