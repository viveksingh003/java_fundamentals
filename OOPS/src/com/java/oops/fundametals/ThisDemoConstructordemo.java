package com.java.oops.fundametals;

public class ThisDemoConstructordemo {

    ThisDemoConstructordemo() {
        this(2);
        System.out.println("No arg const called");
    }

    ThisDemoConstructordemo(int a) {
        this(2.0f);
        System.out.println("param int a " + " \"const called\" ");
    }

    ThisDemoConstructordemo(float a) {
        this(3.0);
        System.out.println("param float a " + " \"const called\" ");
    }

    ThisDemoConstructordemo(double d) {
        System.out.println("param double d " + " \"const called\" ");
    }

    public static void main(String[] args) {
        ThisDemoConstructordemo obj = new ThisDemoConstructordemo();
    }
}


