package com.naveen.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromUserInput {
    public static void main(String[] args) {
        System.out.println("Enter an number of elements : ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int[] array=new int[num];

        System.out.println("Enter an elements of an array : ");

        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
