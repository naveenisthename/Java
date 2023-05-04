package com.naveen.integer;

import java.util.Scanner;

public class PalindromeCheckSecondWay {
    public static void main(String[] args) {
        System.out.print("Enter an number : ");
        Scanner input=new Scanner(System.in);
        int digit,result=0,number =input.nextInt();

        int temp=number;
        while(number!=0){
             digit=number%10;
             result=result*10+digit;
             number=number/10;
        }

        if(temp==result) {
            System.out.println("Palindrome");
        }else System.out.println("Not an Palindrome");

     }
}
