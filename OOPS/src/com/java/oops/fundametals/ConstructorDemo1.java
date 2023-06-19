package com.java.oops.fundametals;

public class ConstructorDemo1 {

    ConstructorDemo1() { //access modifier like public , protected allowed
        System.out.println("Constructor get called");
    }
    /*private ConstructorDemo1() {

    access modifier private is allowed because
     we are creating obj in same class

    }*/

    void ConstructorDemo1() {
        System.out.println("ConstructorDemo1 method get called");
    }

    public static void main(String[] args) {

        ConstructorDemo1 constructorDemo1 = new ConstructorDemo1();
        constructorDemo1.ConstructorDemo1();//method get called
    }
}
