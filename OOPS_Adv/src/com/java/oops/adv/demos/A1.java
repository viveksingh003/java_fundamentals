package com.java.oops.adv.demos;

public class A1 {
    void m1() {
        System.out.println("m1");
    }
}

class B extends A1 {
    void m2() {
        System.out.println("m2");
    }

    void m1() {
        System.out.println("m1b");
    }
}

class C extends B {
    void m3() {
        System.out.println("m3");
    }
}

class D extends C {
    void m4() {
        System.out.println("m4");
    }

    void m1() {
        System.out.println("m11");
    }

}


class Test4 {
    public static void main(String[] args) {

        //A1-B-C-D

        D d = new D();

        A1 a = d;
        a.m1();//override -method gets called

        //  D d1=(D)new A1();//java.lang.ClassCastException
        B b = new B();
        A1 ab = new D();
        b = (C) ab;

        b.m2();
        b.m1();


    }
}

