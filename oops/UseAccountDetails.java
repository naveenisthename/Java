package com.naveen.oops;

public class UseAccountDetails {
    public static void main(String[] args) {

        Address add=new Address(12,"Nehru Street","Chennai");

        AccountDetails accDet=new AccountDetails();
        accDet.setName("Prabhu");
        accDet.setAccNum(76325642674763l);
        accDet.setAddress(new Address(12,"Gandhi Street","Delhi"));

        System.out.println(accDet.getAccNum()+", "+accDet.getName()+", "+accDet.getAddress());
        System.out.println(accDet);

        AccountDetails accDet1=new AccountDetails("Raja",764647675657l,add);
        System.out.println(accDet1);
    }
}
