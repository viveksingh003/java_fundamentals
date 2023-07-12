package com.java.basics.statement;

public class BiggestAmongThreeNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int c = 12;

        if (a < b) {
            if (b < c) {
                System.out.println("c is greatest");

            } else {
                System.out.println("b is greatest");
            }
        } else if (b < c) {
            if (c < a) {
                System.out.println("a is greatest");
            } else {
                System.out.println("b is greatest");
            }
        } else if (c < a) {
            if (a < b) {
                System.out.println("b is greatest");
            }
        } else {
            System.out.println("a is greatest");
        }

    }
}

//pattern a<b,b<c -- b<c,c<a--c<a,a<b

