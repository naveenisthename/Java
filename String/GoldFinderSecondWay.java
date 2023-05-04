package com.naveen.String;

import java.util.Scanner;

public class GoldFinderSecondWay {// if only words between same symbol(" ", "," , "/" ).
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String word = "gold";
        boolean found =false;


        String[] check=input.split(" ");

        for (int i = 0; i < check.length; i++) {
            if (check[i].equalsIgnoreCase("gold")) {
                found=true;
            }
        }

        if(found){
            System.out.println("Gold found");
        }else {
            System.out.println("Gold not found");
        }
    }
}