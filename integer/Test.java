package com.naveen.integer;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         int number= scanner.nextInt();

         //Count digits;
//        int count=0;
//        while(number!=0){
//            int digit=number%10;
//            count++;
//            number=number/10;
//        }
//        System.out.println(count);

        //Sum of digits;
//        int sum=0;
//        while(number!=0){
//            int digit=number%10;
//            sum+=digit12345;
//            number=number/10;
//        }
//        System.out.println(sum);

        //Number Reverser;
//        int result=0;
//        while(number!=0){
//            int digit=number%10;
//            result=result*10+digit;
//            number=number/10;
//        }
//        System.out.println(result);

        //Credit score checker
//        if (number>=400 && number<=500){
//            System.out.println("Silver Card");
//        } else if (number>=501 && number<=700) {
//            System.out.println("Gold Card");
//        } else if (number>=701 && number<=800) {
//            System.out.println("Platinum Card");
//        }else{
//            System.out.println("Please enter a valid input");
//    }
        //digits extractor;
        int digit=0;
        while(number!=0){
            digit=number%10;
            System.out.print(digit+" ");
            number=number/10;
        }

    }
}
