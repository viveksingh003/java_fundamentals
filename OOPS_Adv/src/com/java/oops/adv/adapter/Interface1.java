package com.java.oops.adv.adapter;

public interface Interface1 {
    void m1();

    void m2();

    void m3();

    void m4();

    void m5();

    void m6();

    void m7();

    void m8();

    void m9();

}

abstract class ImplClass implements Interface1 { //don't want to create obj for this class

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m5() {

    }

    @Override
    public void m6() {

    }

    @Override
    public void m7() {

    }

    @Override
    public void m8() {

    }

    @Override
    public void m9() {

    }
}

class BusinessReqClass extends ImplClass {
    public void m2() {
        System.out.println("method require for current class");

    }

    @Override
    public void m3() {
        System.out.println("method require for current class");

    }


}

class App1 {


    public static void main(String[] args) {


        BusinessReqClass obj = new BusinessReqClass();
        obj.m2();
        obj.m3();

    }
}