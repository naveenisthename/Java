package com.naveen.integer;

import java.util.Scanner;

public class CreditScoreChecker {
    public static void main(String[] args) {
        System.out.print("Enter a Credit Score : ");
        Scanner input =new Scanner(System.in);
        int credit=input.nextInt();

        if(credit<400 || credit>800) {
            System.out.println("Invalid Credit");
        } else if (credit >=400 && credit <= 600) {
            System.out.println("Silver Card");
        } else if (credit >=601 && credit <= 700) {
            System.out.println("Gold Card");
        }else  {
            System.out.println("Platinum Card");
        }
    }
}
