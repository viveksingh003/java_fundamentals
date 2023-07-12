package com.java.oops.adv.interfc;

public interface I {
    //private int b=10;//modifier private not allowed here
    int x = 10; // by def public static final

    void m1(); // by def public abstract

    void m2(); //by def public abstract

}

class C implements I {

    @Override
    public void m1() {
        System.out.println("implement m1 method");

    }

    @Override
    public void m2() {
        System.out.println("implement m2 method");
    }

    public void m3() {
        System.out.println("m3 method");
    }
}

class Test {
    public static void main(String[] args) {
        I i = new C();
        i.m2();
        i.m1();
        //   i.m3(); // can't access

        System.out.println(i.x);
        C c = new C();
        c.m1();
        c.m2();
        System.out.println(I.x);
        c.m3();
    }
}
