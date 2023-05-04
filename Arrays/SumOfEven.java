package com.naveen.Arrays;

import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number of the elements ");
        int num=scanner.nextInt();
        int [] array=new int[num];

        System.out.println("Enter the elements of the array ");
        int sum=0;
        for (int i = 0; i < num; i++) {
            array[i]=scanner.nextInt();
            if (array[i]%2==0) {
                sum += array[i];
            }
        }

        System.out.println("The sum of an array "+sum);
    }
}
