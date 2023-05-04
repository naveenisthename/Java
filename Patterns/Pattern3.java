package com.naveen.Patterns;

//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

public class Pattern3 {
    public static void main(String[] args) {
       pattern(5);
    }

    public static void pattern(int num){
        for (int row = 1; row <=num; row++) {
            for (int col = 1; col <= num-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
