package com.java.basics.operators;

public class BitwiseOp1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println(a & b); // 2
        System.out.println(a | b); // 10
        System.out.println(a ^ b); // 8
        System.out.println(a<<b); // 40
        System.out.println(a>>b); // 2
    }
}
