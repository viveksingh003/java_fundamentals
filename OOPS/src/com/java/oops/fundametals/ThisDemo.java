package com.java.oops.fundametals;

public class ThisDemo {
    int a = 10;
    int b = 20;
    int c=100;


    ThisDemo(int a, int b) {
        System.out.println("local var a= " + a + " local var b= " + b);
        System.out.println("class level a= " + this.a + " class level b= " + this.b);
        System.out.println(c);
    }

    public static void main(String[] args) {

        ThisDemo thisDemo = new ThisDemo(100, 200);

    }
}
