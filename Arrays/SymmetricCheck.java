package com.naveen.Arrays;

import java.util.Scanner;

public class SymmetricCheck {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of the rows ");
        int rows=scanner.nextInt();
        System.out.println("Enter the number of the columns");
        int columns=scanner.nextInt();

        int[][] matrix=new int[rows][columns];
        int[][] transposedMatrix=new int[columns][rows];


        System.out.println("Enter the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }

        System.out.println("The Matrix is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transposedMatrix[i][j]=matrix[j][i];
            }
        }

        System.out.println("The Transposed Matrix is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(transposedMatrix[i][j]+" ");
            }
            System.out.println();
        }

        boolean symmetric=true;

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j <rows; j++) {
                if (matrix[i][j] != transposedMatrix[i][j]) {
                   symmetric=false;
                   break;
                }
            }
        }

        if(symmetric){
            System.out.println("Symmetric");
        }else {
            System.out.println("Asymmetric");
        }

    }
}
