package com.java.oops.fundametals;

public interface Interface1 {

    int a = 10;

    void method1();

}

class InterfaceDemo implements Interface1 {

    @Override
    public void method1() {
        System.out.println("method1");
    }

    void method2() {
        System.out.println("method2");
    }

    public static void main(String[] args) {


        InterfaceDemo demo = new InterfaceDemo();
        demo.method1();
        demo.method2();
        int b = demo.a;
        System.out.println(Interface1.a);

        Interface1 demo1 = new InterfaceDemo();
        demo1.method1();
        // demo1.method2(); //error
        int c = demo1.a;
        System.out.println(c + " " + Interface1.a);
    }
}
