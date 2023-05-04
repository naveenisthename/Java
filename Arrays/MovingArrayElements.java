package com.naveen.Arrays;

import java.util.Arrays;

public class MovingArrayElements {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        int[] array2=new int[array.length];

        int originalPosition = 1;
        int newPosition = 4;
        int [] myArray = {23, 93, 56, 92, 39};
        int temp = myArray[originalPosition];
        myArray[originalPosition] = myArray[newPosition];
        myArray[newPosition] = temp;
        System.out.println(Arrays.toString(myArray));

//        for (int i = 0; i < array.length; i++) {
//            if (array[i]%2==0){
//                array2[i]=array[i];
//            }
//
//        }
//
//        for (int i = 0; i < array2.length; i++) {
//            System.out.print(array2[i]+" ");
//        }
    }
}
