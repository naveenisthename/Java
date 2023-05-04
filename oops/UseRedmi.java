package com.naveen.oops;

public class UseRedmi {
    public static void main(String[] args) {
        Redmi mi= new Redmi();
        mi.brand(5);
        mi.price();//void don't need an sout
        mi.type();
        mi.id();//return data type need an sout always or we can't see it in the console
        System.out.println(mi.id()+", "+mi.version());//return data type used sout for a output in a console


    }
}
