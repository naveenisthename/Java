package com.naveen.Arrays;

import java.util.Scanner;

public class MiniPeaks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = scanner.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements of an array ");
        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextInt();
        }


        for (int i = 1; i < array.length-1; i++) {
            if (array[i]>array[i-1] && array[i]>array[i+1]){
                System.out.println(array[i]);
            }
        }
        scanner.close();

    }
}
