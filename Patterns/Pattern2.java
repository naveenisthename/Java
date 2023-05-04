package com.naveen.Patterns;
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
public class Pattern2 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int number){
        for  (int row = 1; row <= number; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
