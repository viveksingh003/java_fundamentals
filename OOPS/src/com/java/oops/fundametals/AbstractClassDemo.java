package com.java.oops.fundametals;

abstract class demo {
    void method1() {
        System.out.println("Method1");
    }

    abstract void method2();

}

public class AbstractClassDemo extends demo {
    @Override
    void method2() {
        System.out.println("Method2");
    }

    void method3() {
        System.out.println("method3");
    }

    public static void main(String[] args) {
        demo ab = new AbstractClassDemo();
        ab.method1();
        ab.method2();
        //ab.method3(); //error
        AbstractClassDemo ab1 = new AbstractClassDemo();
        ab1.method2();
        ab1.method1();
        ab1.method3();
    }
}
