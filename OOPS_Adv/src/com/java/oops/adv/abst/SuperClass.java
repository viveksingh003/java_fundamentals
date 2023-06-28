package com.java.oops.adv.abst;

public abstract class SuperClass {
    abstract String m1();

    void m() { //concrete method
        System.out.println("hello");
    }
}

class SubClass extends SuperClass {
    void m2() { //concrete method
        System.out.println("hello");
    }

    void m3() { //concrete method
        System.out.println("hello");
    }

    String m1() {

        System.out.println("SubClass Method");

        return "m1 subclass method" + "";
    }

}

class Test {
    public static void main(String[] args) {

        SuperClass s = new SubClass();
        //  s.m2();//not possible
        s.m1();

        SubClass s2 = new SubClass();

        s2.m1();
        s2.m2();
        s2.m3();

    }

}
