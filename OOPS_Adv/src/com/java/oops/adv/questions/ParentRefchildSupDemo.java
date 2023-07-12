package com.java.oops.adv.questions;

//*****imp
public class ParentRefchildSupDemo {
    int a = 0;

    static {
        System.out.println("static block sup");
    }

    {
        System.out.println("instance block sup");
    }

    ParentRefchildSupDemo() {
        System.out.println("const-sup");
    }


}

class ParentRefchildSubDemo extends ParentRefchildSupDemo {
    int b = 0;

    static {
        System.out.println("static block sub");
    }

    {
        System.out.println("instance block sub");
    }

    ParentRefchildSubDemo() {
        System.out.println("const-sub");
    }

}

class Test3 {
    {
        System.out.println("Test inst block");
    }

    static {
        System.out.println("static test block");
    }

    Test3() {
        System.out.println("Test const");
    }

    public static void main(String[] args) {
        // ParentRefchildSupDemo p = new ParentRefchildSupDemo();

        /*

        static test block
        static block sup
        instance block sup
        const-sup
         */
        // ParentRefchildSubDemo p1 = new ParentRefchildSubDemo();
       /*
        static test block
        static block sup
        static block sub
        instance block sup
        const-sup
        instance block sub
        const-sub
        */
        ParentRefchildSupDemo p3 = new ParentRefchildSubDemo();
        /*
    static test block
    static block sup
    static block sub
    instance block sup
    const-sup
    instance block sub
    const-sub
         */
    }
}
