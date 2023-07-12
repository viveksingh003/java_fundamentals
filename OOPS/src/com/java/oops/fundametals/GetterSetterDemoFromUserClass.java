package com.java.oops.fundametals;

public class GetterSetterDemoFromUserClass {
    public static void main(String[] args) {
        User u=new User();
        u.setUname("Vivek");
        u.setUpwd("12334");
        System.out.println(u.getUname()+"    "+u.getUpwd());


    }
}
