package com.naveen.String;

import java.util.Scanner;

public class GoldFinder {
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String word = "gold";
        boolean found = false;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            int k=i,j=0;
            for (j = 0; j < word.length(); j++) {
                if (input.charAt(k)!=word.charAt(j)){
                    break;
                }
                k++;
            }

        if (j==word.length()) {
        found=true;
        break;
        }

        }
        if (found){
            System.out.println("Gold found");
        }else {
            System.out.println("Gold not found");
        }

    }
}