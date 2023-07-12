package com.java.basics.operators;

public class AssignmentOp1 {
    public static void main(String[] args) {
        int a = 5; // = assignment operator// 5 assigned to a
        System.out.println(a);//5
        int b = 10;
        a += b;
        System.out.println(a);//15

        System.out.println(b -= a);//-5
    }
}
