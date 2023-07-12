package com.java.basics.loops;

public class whileDemo3 {
    public static void main(String[] args) {
        int i = 0;

        //while (false){ //makes while loop unreachable
        //  System.out.println(i);
        //i=i+1;
        //  }
        // System.out.println("unreachable");
        while (true) {
            System.out.println(i);
            i = i + 1;
        }
        // System.out.println("unreachable");


    }
}
