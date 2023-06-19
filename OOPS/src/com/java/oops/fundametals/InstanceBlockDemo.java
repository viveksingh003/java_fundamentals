package com.java.oops.fundametals;

public class InstanceBlockDemo {

    {
        System.out.println("Instance block get called");
    }

    int a = instanceMethod(); //order precedence (here block comes first in order)

    int instanceMethod() {
        System.out.println("Instance method called");
        return 2;
    }

    InstanceBlockDemo() {
        System.out.println("Constructor get called");
    }

    public static void main(String[] args) {
        InstanceBlockDemo i = new InstanceBlockDemo();

    }

    //Instance block get called
    //Instance method called
    //Constructor get called
}
