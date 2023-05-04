package com.naveen.String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenWordPrinterSecondWay {
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        String[] words=input.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length()%2==0){
                System.out.println(words[i]);
                System.out.println(words[i].contains("gold"));//gold finder
                System.out.println(words[i].equals("gold"));//gold finder
            }

        }
    }
}
