package com.naveen.integer;

import java.util.Scanner;

public class DigitExtractor {
    public static void main(String[] args) {

        System.out.println("Enter a Digit : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int result=0;

        while (number != 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number = number / 10;
        }

//               for(int i=number;i!=0;i/=10){
//            int digit=i%10;
//            System.out.println(digit);
//        }
      input.close();
    }
}