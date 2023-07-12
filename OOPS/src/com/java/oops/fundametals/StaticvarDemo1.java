package com.java.oops.fundametals;

public class StaticvarDemo1 {

    static int a = 10;
    int b = 101;

    static void m3() {
        System.out.println("");
    }

    static void m2() {
        StaticvarDemo1 s = new StaticvarDemo1();
        System.out.println(s.b);

    }

    void m1() {
        // static int a=10;
        //Static variables must be declared as class level variables only,
        //never be declared as local variables
        int a = 100;
        System.out.println(this.a);
        //To access current class static variables we can use "this" keyword.
    }

    public static void main(String[] args) {
        StaticvarDemo1 obj = new StaticvarDemo1();
        System.out.println(a);
        StaticvarDemo1.a = 100;
        System.out.println(a);
        StaticvarDemo1 obj1 = null;
        System.out.println(obj1.a);
        //System.out.println(obj1.b);//RE(java.lang.NullPointerException)
    }
}
