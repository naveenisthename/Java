package com.naveen.integer;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();

        double formula = 3.14 * radius * radius;

        System.out.println("AreaOfCircle - " + formula);


    }
}



