package com.naveen.String;
import java.util.Scanner;

public class MaxOccuranceFinder {

    public static void main(String[] args) {
        System.out.println("Enter an String : ");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int[] arr=new int[256];

        for (int i = 0; i < input.length(); i++) {
            arr[(int)input.charAt(i)]++;
        }

        int m=0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j]>arr[m]){
                m=j;
            }

        }
        //char n=(char)m; typecasting int to char

        System.out.println("The maximum occurance of an Charater is "+(char)m);
    }

}



