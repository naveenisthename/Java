package com.naveen.Patterns;
//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *

public class Pattern6 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int num) {

        for (int row = 1; row <= num * 2 - 1; row++) {
            int totalNumOfColInRow = row > num ? num * 2 - row : row;
            int numOfSpace = num - totalNumOfColInRow;
            for (int space = 1; space <= numOfSpace; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalNumOfColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}


