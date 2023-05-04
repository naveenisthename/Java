package com.naveen.Arrays;

import java.util.Scanner;

public class LastMelements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter an number of an elements : ");
        int num=scanner.nextInt();
        int [] arr=new int[num];

        System.out.println("Enter an elements of an array : ");
        for (int i=0;i<num;i++){
            arr[i]=scanner.nextInt();
        }

        System.out.println("Enter an number for showing last elements of an array : ");
        int lastElement= scanner.nextInt();
        if (num > lastElement) {
            for (int i = num-lastElement; i <num ; i++) {
                System.out.println(arr[i]);
            }
        }else{
            System.out.println("Enter an valid input ");
        }
    }
}
