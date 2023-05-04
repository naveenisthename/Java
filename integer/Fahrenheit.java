package com.naveen.integer;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int celsius= input.nextInt();

        int formula=(celsius * (9/5) + 32);

        System.out.println("Fahrenheit - "+formula);
    }
}
