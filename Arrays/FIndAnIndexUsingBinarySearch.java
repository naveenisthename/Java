package com.naveen.Arrays;

import java.util.Arrays;

public class FIndAnIndexUsingBinarySearch {
    public static void main(String[] args) {
        int[] numbers={1,2,5,7,9,22,45,6,13};
        int key=13;
        Arrays.sort(numbers);

        int index= Arrays.binarySearch(numbers,key);

        System.out.println(index);

    }
}
