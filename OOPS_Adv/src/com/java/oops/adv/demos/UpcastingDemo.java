package com.java.oops.adv.demos;

public class UpcastingDemo {
    void m1(){
        System.out.println("parent");
    }

}
class A extends UpcastingDemo {
    void m1(){
        System.out.println("child");
    }

    void m2(){
        System.out.println("");
    }
    public static void main(String[] args) {

        A a = new A();
        System.out.println(a);
        UpcastingDemo up = new UpcastingDemo();
        System.out.println(up);

        up = a;
        up.m1();//child

        System.out.println(up);

        UpcastingDemo up1 = a;
        System.out.println(up1);

    }

}
/*
com.java.oops.adv.demos.A@1540e19d
com.java.oops.adv.demos.UpcastingDemo@677327b6
child
com.java.oops.adv.demos.A@1540e19d
com.java.oops.adv.demos.A@1540e19d
 */