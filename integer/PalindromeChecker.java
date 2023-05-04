package com.naveen.integer;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.print("Enter an number : ");
        Scanner input=new Scanner(System.in);
        String number =input.next();

        StringBuffer sb=new StringBuffer(number);
        String checkPalindrome=sb.reverse().toString();
        System.out.println(number.equals(checkPalindrome)?"Palindrome":"Not an Palindrome");
    }
}
