package com.naveen.String;

import java.util.Scanner;

public class VowelRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();

        System.out.println(input.replaceAll("[aeiou]",""));

        StringBuffer output=new StringBuffer();

        String output2="";


        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u' ) {
               continue;
            }else {
                 output.append(input.charAt(i));
                 output2+=input.charAt(i);
            }
        }

        System.out.println(output);
        System.out.println(output2);


        scanner.close();
    }

}
