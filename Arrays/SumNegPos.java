package com.naveen.Arrays;

import java.util.Scanner;

public class SumNegPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements for the array");
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }

        int sumOfNeg=0;
        int sumOfPos=0;

        for (int i = 0; i < a.length; i++) {
            if (a[i]<0 && a[i]!=0){
                sumOfNeg+=a[i];
            }else if (a[i]>0 && a[i]!=0){
                sumOfPos+=a[i];
            }
         }

        System.out.println("Sum of negative : "+sumOfNeg);
        System.out.println("Sum of positive : "+sumOfPos);
    }
}
