package com.java.oops.adv.demos;

public class SuperClassParent {
    void m1() {
        System.out.println("m1- Superclass method");
    }

    void m3() {
        System.out.println("m3- Superclass method");
    }

}

class SubClassChild extends SuperClassParent {

    void m2() {
        System.out.println("m2- Subclass method");
    }

    void m3() {
        System.out.println("m3- Sub method");
    }

}

class Test1 {
    public static void main(String[] args) {

        SuperClassParent p = new SuperClassParent();
        p.m1();
        p.m3();
        SubClassChild c = new SubClassChild();
        p = c;
        p.m3();

        SuperClassParent p1=new SubClassChild();
        p.m3();

/*
m1- Superclass method
m3- Superclass method
m3- Sub method
m3- Sub method
 */
    }
}
