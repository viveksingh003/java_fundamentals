package com.java.oops.fundametals;

//Important ---Static context vs Instance context
public class StaticBlockDemo {
    int a = m1();
    static int b = m2();

    {
        System.out.println("Instance Block get called");
    }

    static {
        System.out.println("Static block get called");


    }

    int m1() {
        System.out.println("m1 instance method get called");
        return 2;
    }

    static int m2() {
        System.out.println("m2 static method get called");
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Main-called");
        StaticBlockDemo obj = new StaticBlockDemo();
    }
/*
m2 static method get called
Static block get called
Main-called
m1 instance method get called
Instance Block get called
 */

}
