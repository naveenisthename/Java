package com.naveen.String;

import java.util.Scanner;

public class CheckPalindromeUsingTwoMethods {
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        String reverse="";
        //Using For
        for (int i = input.length()-1; i >=0 ; i--) {
            reverse+=input.charAt(i);
        }
        if (input.equals(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not an Palindrome");
        }

//        Using StringBuffer;

        System.out.println((new StringBuffer(input).reverse()));//In console(Runtime) it will reverse a string,not in complie time
        System.out.println((new StringBuffer(input).reverse().toString()).equals(input)?"Palindrome":"Not an Palindrome ");
        //using toString only reverse a string in compile time or before execution and check the conditions before executing.

    }
}
