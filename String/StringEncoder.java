package com.naveen.String;

import java.util.Scanner;

public class StringEncoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input=scanner.nextLine();
        String encoder="";

        for (int i = 0; i < input.length(); i++) {
            encoder+=(char)input.charAt(i)+1;
        }

        System.out.println(encoder);
    }
}
