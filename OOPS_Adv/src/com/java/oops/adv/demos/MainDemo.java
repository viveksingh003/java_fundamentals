package com.java.oops.adv.demos;

public class MainDemo {

    public static void main(String[] args) {


        System.out.println("String[] args");


        System.out.println("inside class MainDemo method");
    }

    public static void main(int[] args) {
        System.out.println("int[] args");

    }

    public static void main(float[] args) {
        System.out.println("float[] args");

    }
}

class M {
    public static void main(String[] args) {
        MainDemo.main(new String[]{"a"});
    }
}

