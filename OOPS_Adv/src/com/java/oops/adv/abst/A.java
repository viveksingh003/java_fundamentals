package com.java.oops.adv.abst;


public abstract class A {

    {
        System.out.println("Instance block -Abstract class");
    }

    int a = m1();

    int m1() {
        System.out.println(" concrete method in abstract class");
        return 1;
    }

    A() {
        System.out.println("Abstract class const");
    }


}

class B extends A {
    B() {
        System.out.println("B class const");
    }
}

class App {
    public static void main(String[] args) {
        A a = new B();
    }
/*
Instance block -Abstract class
 concrete method in abstract class
Abstract class const
B class const
 */


}
