package com.naveen.Arrays;

import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows=scanner.nextInt();
        System.out.println("Enter the number of columns ");
        int columns= scanner.nextInt();

        int [][] array=new int[rows][columns];

        System.out.println("Enter the matrix ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j]=scanner.nextInt();
            }
        }

        System.out.println("The matrix is ");
        int zeroCount=0,nonZeroCount=0;

        for (int i = 0; i <rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j]+" ");
                if (array[i][j]==0){
                    zeroCount++;
                }else{
                    nonZeroCount++;
                }
            }
            System.out.println();
        }

        if(zeroCount>nonZeroCount){
            System.out.println("Sparse Matrix");
        }else {
            System.out.println("Not a Sparse Matrix");
        }

        System.out.println("Zero Count : "+zeroCount+" , "+"Nonzero count : "+nonZeroCount);

        if (zeroCount > (rows * columns) / 2) {
            System.out.println("Sparse Matrix");
        } else {
            System.out.println("Not a Sparse Matrix");
        }

    }
}
