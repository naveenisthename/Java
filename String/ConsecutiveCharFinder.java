package com.naveen.String;

import java.util.Scanner;

public class ConsecutiveCharFinder {
    public static void main(String[] args) {

        System.out.print("Enter a String : ");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();
        boolean found=false;

        for (int i = 0; i < input.length()-1; i++) {
            if (input.charAt(i)==input.charAt(i+1)){
                found=true;
            }
        }
        System.out.println(found);
        }
}
