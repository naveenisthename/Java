package com.naveen.String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenWordPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();

      StringTokenizer tokenizer=new StringTokenizer(input);

      while(tokenizer.hasMoreTokens()){
          String eachtoken=tokenizer.nextToken();
          if(eachtoken.length()%2==0){
              System.out.println(eachtoken);
          }
      }
        scanner.close();
    }
}
