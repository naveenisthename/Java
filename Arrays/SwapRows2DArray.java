package com.naveen.Arrays;

import java.util.Scanner;

public class SwapRows2DArray {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter an number of rows : ");
        int row=scanner.nextInt();
        System.out.print("Enter an number of coulmn : ");
        int column=scanner.nextInt();

        int[][] array=new int[row][column];

        System.out.println("Enter the Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j]= scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter an row numbers to swap : ");
        int swaprow1=scanner.nextInt();
        int swaprow2=scanner.nextInt();

        int temp=0;

        for (int i = 0; i < column; i++) {
                temp=array[swaprow1-1][i];
                array[swaprow1-1][i]=array[swaprow2-1][i];
                array[swaprow2-1][i]=temp;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
