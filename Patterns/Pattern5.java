package com.naveen.Patterns;

//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*
public class Pattern5 {
        public static void main(String[] args) {
            pattern(8);
        }

        public static void pattern(int num) {
            for (int row = 1; row <=num*2-1 ; row++) {
                int totalColsInRow=row>num?((num*2)-row):row;
                for (int col = 1; col <= totalColsInRow; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


    }

