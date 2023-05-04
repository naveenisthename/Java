package com.naveen.String;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        String reverse="";

        for (int i = input.length()-1; i >=0 ; i--) {
        reverse+=input.charAt(i);
        }
        System.out.println(reverse);
    }
}
