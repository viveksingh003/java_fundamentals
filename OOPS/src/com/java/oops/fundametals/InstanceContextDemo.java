package com.java.oops.fundametals;

public class InstanceContextDemo {

    int a = instanceMethod();

    InstanceContextDemo() {
        System.out.println("Constructor get called");
    }

    int instanceMethod() {
        System.out.println("Instance method get called");
        return 3;
    }

    public static void main(String[] args) {
        InstanceContextDemo i = new InstanceContextDemo();
        //Instance method get called
        //Constructor get called

    }
}