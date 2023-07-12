package com.java.oops.adv.demos;

public class SuperKeywordDemo {
    String name = "super";

    SuperKeywordDemo() {



        //System.out.println(a);
    }

    SuperKeywordDemo(int a) {
        System.out.println("SuperKeywordDemo const");
    }

    void method() {
        System.out.println("super class method");
    }

}

class Child extends SuperKeywordDemo {
    String name = "sub";

    void method() {
        System.out.println("sub class method");

    }

    Child() {
        super(1);
        System.out.println("child const");
        method();
        super.method();

    }

    Child(int a) {

    }

    void m1() {
        String name = "local";
        System.out.println(name);//local
        System.out.println(this.name);//sub
        System.out.println(super.name);//super

    }

    void m2() {
        new Child();
        new SuperKeywordDemo();
        new SuperKeywordDemo(1);
    }

    public static void main(String[] args) {


        Child c = new Child();
        c.m2();

        System.out.println(c.name);//by default sub
        //  c.m1();
        // c.m2();
        // c.method();


    }


}
