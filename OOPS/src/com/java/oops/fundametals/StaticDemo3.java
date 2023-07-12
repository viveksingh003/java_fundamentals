package com.java.oops.fundametals;

public class StaticDemo3 {
    static int a = m1();

    static {
        System.out.println("static block get called");
    }

    static int m1() {
        System.out.println("m1 static mathod called");
        return 1;
    }

    static void m2() {
        System.out.println("m2 static mathod called");
    }

    public static void main(String[] args) {
        StaticDemo3 s = new StaticDemo3();
        //Byte code already existed for <StaticDemo3> so JVM will not reload ,
        // but will reuse for next.
        StaticDemo3 s1 = new StaticDemo3();

    }
}
