package com.java.oops.fundametals;

public class ConstructorTypesDemo {

    ConstructorTypesDemo() {
        System.out.println("User Defined 0-arg constructor");

    }

    ConstructorTypesDemo(int a) {
        System.out.println("User defined Parametrized Constructor get called and value of a is " + a);

    }

    public static void main(String[] args) {

        ConstructorTypesDemo constructorTypesDemo = new ConstructorTypesDemo();
        ConstructorTypesDemo constructorTypesDemo1 = new ConstructorTypesDemo(2);

    }
}
