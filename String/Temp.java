package com.naveen.String;

public class Temp {
    public static void main(String[] args) {
       StringBuffer s1=new StringBuffer("A");
       StringBuffer s2=new StringBuffer(" B");

       operate(s1,s2);
        System.out.println(s1+" ,"+s2);

    }

    static void operate(StringBuffer x,StringBuffer y){
        x.append(y);
        y=x.append("C");
        y.append("D");

    }

}


