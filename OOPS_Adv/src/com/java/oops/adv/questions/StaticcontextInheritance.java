package com.java.oops.adv.questions;

public class StaticcontextInheritance {
    static int a = m1();

    static {
        System.out.println("static block superclass");
    }

    static int m1() {
        System.out.println("static method superclass");
        return 1;
    }

    int b = m2();

    int m2() {
        System.out.println("instance super class method");
        return 1;
    }

    {
        System.out.println("instance block sup class");
    }

}

class SubClass1 extends StaticcontextInheritance {
    {
        System.out.println("SubClass1 block");
    }

    int d = m3();

    int m3() {
        System.out.println("instance sub class method");
        return 1;
    }

    public static void main(String[] args) {

        SubClass1 s = new SubClass1();

    }

}
//imp
/*
static method superclass
static block superclass
instance super class method
instance block sup class
SubClass1 block
instance sub class method
 */
