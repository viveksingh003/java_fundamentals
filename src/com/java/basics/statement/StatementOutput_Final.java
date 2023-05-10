package com.java.basics.statement;

public class StatementOutput_Final {
    public static void main(String[] args) {
        final int a = 10;
        int b;

        if (a == 10) {// constant expr =- 10==10 (compiler evaluate)
            b = 20;
        }
        System.out.println(b);
        //-----------------//
        final int c = 10;
        int d;

        if (c == 10) {
            // b=20;
        }
        //System.out.println(d); //java: variable d might not have been initialized

        final int e = 10;
        int f;

        if (true) {
            //f=20;
        }
       // System.out.println(f); //java: variable f might not have been initialized
    }
}
