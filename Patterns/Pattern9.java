package com.naveen.Patterns;

//        5 5 5 5 5 5 5 5 5 5 5
//        5 4 4 4 4 4 4 4 4 4 5
//        5 4 3 3 3 3 3 3 3 4 5
//        5 4 3 2 2 2 2 2 3 4 5
//        5 4 3 2 1 1 1 2 3 4 5
//        5 4 3 2 1 0 1 2 3 4 5
//        5 4 3 2 1 1 1 2 3 4 5
//        5 4 3 2 2 2 2 2 3 4 5
//        5 4 3 3 3 3 3 3 3 4 5
//        5 4 4 4 4 4 4 4 4 4 5
//        5 5 5 5 5 5 5 5 5 5 5
public class Pattern9 {
    public static void main(String[] args) {
        pattern(6);
    }

    static void pattern(int n) {
        int originalN=n;
        n=n*2;
        for (int row = 0; row <= n; row++) {

            for (int col = 0; col <=n ; col++) {
                int atEveryIndex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }



}

