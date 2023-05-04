package com.naveen.String;

import java.util.Arrays;
import java.util.Scanner;

public class StringOrderChecker {
        public static void main(String[] args) {
            System.out.println("Enter a String : ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            char[] charArray = input.toCharArray();

            Arrays.sort(charArray);

            System.out.println(new String(charArray).equals(input));
        }
}
