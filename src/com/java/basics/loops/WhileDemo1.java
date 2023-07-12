package com.java.basics.loops;

public class WhileDemo1 {
    public static void main(String[] args) {
        int i=0;

        while (i<=0||i>=0){//variable expression jvm will evaluate
            System.out.println("a");
            i=i+1;
        }
        System.out.println("last statement");
    }
}
