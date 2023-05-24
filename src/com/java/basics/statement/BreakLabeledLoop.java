package com.java.basics.statement;

public class BreakLabeledLoop {
    public static void main(String[] args) {
        //l1:
        for (int i = 0; i < 10; i++) {
            System.out.println("mainloop");
            //l2:
            for (int j = 0; j < 5; j++) {
                System.out.println("inside for");
                break;
                //break l1;
            }


        }

    }
}
