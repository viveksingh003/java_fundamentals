package com.java.basics.statement;

public class BreakDemo1 {
    public static void main(String[] args) {
        //int i;
        //int j = 0;
        for (int i = 0; i < 10; i++) {
            // if (i==4)
            // break;// break from main for loop
            for (int j = 0; j < 10; j++) {
                if (j == 5)
                    break;// break from inside  for loop
                System.out.println(i + "   " + j);
            }

        }
        // System.out.println(i+" "+j);
    }
}
