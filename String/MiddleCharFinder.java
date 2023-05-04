package com.naveen.String;

import java.util.Scanner;

public class MiddleCharFinder {
    public static void main(String[] args) {
        System.out.println("Enter a String :" );
        Scanner scanner= new Scanner(System.in);
        String input=scanner.nextLine();

        System.out.println((input.length()%2==0)?input.charAt(input.length()/2-1)+" , "+input.charAt(input.length()/2):input.charAt(input.length()/2));
    }
}
