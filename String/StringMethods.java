package com.naveen.string;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String word= input.nextLine();

        //UpperCase
        String uppercase=word.toUpperCase();

        //LowerCase
        String lowercase=word.toLowerCase();

        //StartsWith
        boolean startCheck=word.startsWith("N");

        //EndsWith
        boolean endCheck=word.endsWith("t");

        //EqualIgnoreCase
        boolean equalIgnoreCase=word.equalsIgnoreCase("naveenkumar k");

        //Length
        int length=word.length();

        //contains
        boolean checkContains=word.contains("r K");

        //concat
        String concat=word.concat(" K");

        //charAt
        char charAt=word.charAt(6);

        //indexOf
        int index=word.indexOf("a");

        //subString
        String subString=word.substring(3,7);

        //toCharArray
        String names="Ram,Siva,Kiri";
        char[] toCharArray=names.toCharArray();

        //Split
        String[] split=names.split(",");

        System.out.println("UpperCase - "+uppercase);
        System.out.println("LowerCase - "+lowercase);
        System.out.println("StartsWith - "+startCheck);
        System.out.println("EndsWith - "+endCheck);
        System.out.println("EqualIgnoreCase - "+equalIgnoreCase);
        System.out.println("Length - "+length);
        System.out.println("Contains - "+checkContains);
        System.out.println("Concat - "+concat);
        System.out.println("CharAt - "+charAt);
        System.out.println("IndexOf - "+index);
        System.out.println("SubString - "+subString);
        System.out.println("ToCharArray - "+toCharArray[6]);
        System.out.println("Split - "+split[2]);
    }
}
