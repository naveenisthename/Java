package com.naveen.Arrays;

import java.util.Scanner;

public class SumofMatrices {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of the rows");
        int rows=scanner.nextInt();
        System.out.println("Enter the number of the columns");
        int columns= scanner.nextInt();

        int[][] matrix1=new int[rows][columns];
        int[][] matrix2=new int[rows][columns];

        int[][] sumOfMatrix=new int[rows][columns];

        System.out.println("Enter the matrix1");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j]=scanner.nextInt();
            }
        }

        System.out.println("Enter the matrix2");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j]=scanner.nextInt();
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j  = 0;j < columns; j++) {
              sumOfMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        System.out.println("The sum of matrices ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumOfMatrix[i][j]+" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
