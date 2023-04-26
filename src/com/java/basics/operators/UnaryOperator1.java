package com.java.basics.operators;

public class UnaryOperator1 {
    public static void main(String[] args) {
        int a=3;
        float b=1.1f;
        System.out.println(++b);//2.1
        System.out.println(b);//2.1

        System.out.println(a++);//3
        System.out.println(++a);//5
        System.out.println(a);//5

        System.out.println(a++ - ++a);//5-7 -> -2
        System.out.println(--a - b++);//6-2.1-> 3.9
        System.out.println(b +" "+a); // 3.1  6 (""//no space )
    }
}
