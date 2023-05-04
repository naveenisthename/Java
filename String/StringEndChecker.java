package com.naveen.String;

import java.util.Scanner;

public class StringEndChecker {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a first String : ");
        String input1=scanner.nextLine();
        System.out.println("Enter a second string : ");
        String input2=scanner.nextLine();

        int count=0;

        for (int i = input1.length()-1,j=input2.length()-1; j>=0; i--,j--) {
            if (input1.charAt(i)==input2.charAt(j)){
            count++;
            }
        }
        if (count==input2.length()){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

}
