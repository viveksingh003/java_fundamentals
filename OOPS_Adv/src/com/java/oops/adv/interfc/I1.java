package com.java.oops.adv.interfc;

public interface I1 {
    void m1();
}

interface I2 {
    void m2();

}

interface I3 extends I1, I2 {
    void m3();
}

abstract class Impl implements I3 {

    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public void m2() {
        System.out.println("m2-method");
    }

}

class Impl1 extends Impl {

    @Override
    public void m3() {
        System.out.println("m3-method");
    }
}

class App {
    public static void main(String[] args) {

        I1 i1 = new Impl1();
        i1.m1();
        //can't access m2() & m3()
        I3 i3 = new Impl1();
        i3.m3();
        i3.m2();
        i3.m1();
    }
}
