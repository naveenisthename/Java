package com.naveen.Arrays;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        System.out.println("Enter an number of elements ");
        Scanner scanner=new Scanner(System.in);
        int numbers=scanner.nextInt();
        int[] array=new int[numbers];

        System.out.println("Enter elements of an array ");
        for (int i = 0; i < numbers; i++) {
            array[i]= scanner.nextInt();
        }
         //0 1 2 3
         //23 54 67 12

        int min=array[0];
        int max=array[0];

        for (int i = 0; i < numbers; i++) {
            if (min>array[i]){
                min=array[i];
            } else if (max<array[i]) {
                max=array[i];
            }

        }
        System.out.println("Min: "+min+" Max: "+max);
    }
}
