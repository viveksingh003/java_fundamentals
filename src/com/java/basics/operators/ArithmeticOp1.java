package com.java.basics.operators;

public class ArithmeticOp1 {
    public static void main(String[] args) {
        System.out.println(5 % 7); //5
        System.out.println(5 / 7); //0
        System.out.println(5.0 / 7); //or 5/7.0 // 0.7142857142857143
        System.out.println(5 % 2); // modulo operator -- 1 ->remainder
        System.out.println(0.0 / 0.0);// NaN
        System.out.println(5 / 0.0);// Infinity. //when divide by 0.0(NaN,Infinity)

        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at com.java.basics.opeartors.ArithmeticOper1.main(ArithmeticOper1.java:11)
        System.out.println(5 / 0);
    }
}
