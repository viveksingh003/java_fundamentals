package com.java.basics.statement;

public class BiggestBetweenTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println(a + " :a is greatest b/w " + a + " & " + b);
        } else if (b > a) {
            System.out.println(b + " :b is greatest b/w " + a + " & " + b);
        } else {
            System.out.println("Both a and b are same");
        }
    }
}
