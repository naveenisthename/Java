package com.naveen.Collections;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> nameList=new ArrayList<>();
        nameList.add("Vetri");
        nameList.add("Thambi");

        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }

        for(String x:nameList){
            System.out.println(x);
        }

        nameList.forEach(x-> {
            if (x .equals("Vetri")) {
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        });
    }
}
