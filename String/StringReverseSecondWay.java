package com.naveen.String;

import java.util.Scanner;

public class StringReverseSecondWay {
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

//        StringBuffer stringBuffer=new StringBuffer(input);
//        System.out.println(stringBuffer.reverse());

        System.out.println(new StringBuffer(input).reverse());
    }
}
