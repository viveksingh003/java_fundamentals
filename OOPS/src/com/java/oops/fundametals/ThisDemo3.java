package com.java.oops.fundametals;

public class ThisDemo3 {

    void method1() {
        System.out.println("method1 gets called");
        method2();//or
        this.method2();
    }

    void method2() {
        System.out.println("method2 gets called");
    }

    public static void main(String[] args) {
        ThisDemo3 thisDemo3 = new ThisDemo3();
        thisDemo3.method1();
    }
}
