package com.naveen.integer;

import java.util.Scanner;

public class IntToBinarySecondWay {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner input=new Scanner(System.in);
        int number =input.nextInt();

        int[] binaryNumber=new int[10];

        int i=0;

        while(number!=0){
            binaryNumber[i]=number%2;
            number=number/2;
            i++;
        }

        for (int j = i-1; j >=0 ; j--) {
            System.out.print(binaryNumber[j]);
        }

    }
}
