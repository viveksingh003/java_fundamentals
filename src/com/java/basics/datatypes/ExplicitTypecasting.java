package com.java.basics.datatypes;

public class ExplicitTypecasting {

    public static void main(String[] args) {
        long s = 10;
        int l = (byte) s;
        System.out.println(l);//10

        float f = 10.8f;
        long l1 = (int) f;
        System.out.println(l1);//10

        double d = 10;
        int a = (int) d;
        System.out.println(a);//10

    }
}
