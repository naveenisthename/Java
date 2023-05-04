package com.naveen.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};

        int reversed[]=new int[array.length];
        for (int i = 0,j=array.length; i < array.length; i++,j--) {
            reversed[j-1]=array[i];
        }

        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i]+" ");
        }

    }
}
