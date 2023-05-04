package com.naveen.integer;

import java.util.Scanner;

public class DigitExtractorUsingStringBuilder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.next();
        System.out.println(extractDigits(input));

    }

    public  static String extractDigits(String input){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))){
                stringBuilder.append(input.charAt(i)+" ");
            }
        }
    return stringBuilder.toString();
    }
}
