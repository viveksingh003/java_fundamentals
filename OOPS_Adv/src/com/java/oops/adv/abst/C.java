package com.java.oops.adv.abst;

public class C {
    void m() {
        System.out.println("concrete class method");
    }
}

abstract class D extends C {

    void m1() {
        System.out.println("abstract class method");
    }

    abstract void m2();

}

class E extends D {

    @Override
    void m2() {
        System.out.println("E class method");
    }
}

class App2 {
    public static void main(String[] args) {
        E e = new E();
        e.m();
        e.m2();
        e.m1();

        /*
        concrete class method
        E class method
        abstract class method
         */
    }
}
