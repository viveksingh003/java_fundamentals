package com.java.basics.datatypes;

public class ImplicitTypeCasting {

    public static void main(String[] args) {
        byte b = 10;
        int i = b;

        short s=10;
        //byte b1=s; -Explicit

        System.out.println(b + "  " + i); // 10  10
        System.out.println(s);
    }
}
