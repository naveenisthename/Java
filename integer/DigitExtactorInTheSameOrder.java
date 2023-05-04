package com.naveen.integer;

import java.util.Scanner;

public class DigitExtactorInTheSameOrder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        char[] chars=input.toCharArray();

        for (char x : chars) {
            if (Character.isDigit(x)){
                System.out.print(x+" ");
            }
        }
    }
}
