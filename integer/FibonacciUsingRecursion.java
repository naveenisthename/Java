package com.naveen.integer;

import java.util.Scanner;

public class FibonacciUsingRecursion {
    private static int fibonacci(int n) {
        if(n==0 || n==1){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter an Number : ");
        Scanner input=new Scanner(System.in);
        int number =input.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }
}
