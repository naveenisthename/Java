package com.naveen.oops;

public class Redmi implements Mobile,Software{
   public  void brand(int model){

        System.out.println("Redmi"+" "+model);
    }
    public void price(){
        System.out.println(16000);;
    }

    @Override
    public int id() {
        return 15;
    }

    @Override
    public void type() {
        System.out.println("Android");
    }

    @Override
    public int version() {
        return 12;
    }
}
