package com.java.oops.fundametals;

public class ConstructorOverloadingDemo {

    ConstructorOverloadingDemo() {
        System.out.println("No arg const called");
    }

    ConstructorOverloadingDemo(float a) {
        System.out.println("float a called");
    }

    ConstructorOverloadingDemo(char a) {
        System.out.println("char  a called");
    }


    public static void main(String[] args) {
        ConstructorOverloadingDemo c = new ConstructorOverloadingDemo();
        ConstructorOverloadingDemo c1 = new ConstructorOverloadingDemo(2);
        ConstructorOverloadingDemo c3 = new ConstructorOverloadingDemo(2.9f);
        ConstructorOverloadingDemo c4 = new ConstructorOverloadingDemo('a');
    }
}
/*
No arg const called
float a called
float a called
char  a called
 */