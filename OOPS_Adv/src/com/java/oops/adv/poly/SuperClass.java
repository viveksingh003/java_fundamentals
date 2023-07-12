package com.java.oops.adv.poly;

public class SuperClass {
    String m1() {

        System.out.println("SuperClass Method");

        return "m1 superclass method" + "";
    }
}

class SubClass extends SuperClass {

    String m1() {

        System.out.println("SubClass Method");

        return "m1 subclass method" + "";
    }
}

class Test {
    public static void main(String[] args) {

        SuperClass s = new SuperClass();
        s.m1();//No Method Overriding
        SubClass s2 = new SubClass();//Method gets overridden but not getting called from super class ref
        s2.m1();
        SuperClass s1 = new SubClass();
        s1.m1();
/*To provide method overriding we must call super class method
 and get output from subclass method */
    }
    /*
    SuperClass Method
    SubClass Method
    SubClass Method
     */

}
