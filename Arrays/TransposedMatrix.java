package com.naveen.Arrays;

import java.util.Scanner;

public class TransposedMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows=scanner.nextInt();
        System.out.println("Enter the number of coulmn ");
        int columns=scanner.nextInt();

        int [][] array=new int[rows][columns];
        int [][] transposeMatrix=new int[columns][rows];

        System.out.println("Enter a Matrix ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j]=scanner.nextInt();
            }
        }

        System.out.println("The Matrix is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transposeMatrix[i][j]=array[j][i];
            }
        }

        System.out.println("The Transpose Matrix is ");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
