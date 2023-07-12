package com.java.oops.fundametals;

public class ReturnTypeUserDefined {
    static void m1() {
        System.out.println("asasas");
    }

    ReturnTypeUserDefined method1() {
        ReturnTypeUserDefined r = new ReturnTypeUserDefined();
        return r;// return type must be reference of class obj
    }

    int abc() {
        int a = 10;
        return a;
    }

    public static void main(String[] args) {
        m1();

        ReturnTypeUserDefined d = new ReturnTypeUserDefined();
        ReturnTypeUserDefined f=d.method1();
        d.method1();
        System.out.println(d.method1());
        System.out.println(d.abc());
        System.out.println(f);


    }
}
