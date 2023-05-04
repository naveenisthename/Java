package com.naveen.integer;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Starting number : ");
        Scanner input=new Scanner(System.in);
        int start=input.nextInt();
        System.out.print("Ending number : ");
        int end=input.nextInt();

        for (int i = start; i < end; i++) {

            int count=0;

            if (i>1){
                for (int j = 2; j < i/2; j++) {
                    if (i%2==0){
                        count++;
                        break;
                    }
                }
                if (count==0){
                    System.out.print(i+" ");
                }
            }
        }
        input.close();
    }
}
