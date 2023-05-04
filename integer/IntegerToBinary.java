package com.naveen.integer;

import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();

        System.out.println(Integer.toBinaryString(number));
    }
}
