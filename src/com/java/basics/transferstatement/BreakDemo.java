package com.java.basics.transferstatement;

public class BreakDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
                // System.out.println("dwd");
                // Any statement after break statement
                // and continue statement is unreachable.
            }

            System.out.println(i);
        }
        System.out.println("after loop");

    }
}
