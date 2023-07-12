package com.java.oops.adv.demos;

public class DownCasting {
    void m1() {
        System.out.println("super clas method");
    }
}

class Downcastingsub extends DownCasting {
    void m2() {
        System.out.println("sub clas method");
    }
}

class Test3 {
    public static void main(String[] args) {
      /* No compiler error
       DownCasting d=new DownCasting();
        Downcastingsub sd=(Downcastingsub)d;
           java.lang.ClassCastException */

//To resolve
        DownCasting d = new Downcastingsub();
        Downcastingsub sd = (Downcastingsub) d;
        sd.m2();
        sd.m1();

    }


}
