package com.java.basics.loops;

public class ForDemo_1 {

    public static void main(String[] args) {
        int i;
        int j=0;
        for (i=0; i>=0; i++) {

            for (j = 0; j < 10; j++) { // j=0,0<10 -> *
                //1<10<true> --"**"
                System.out.print((char) (97 + j));

            }
            System.out.println(i + "  " + j);

        }
        System.out.println(i + " " + j);

    }


}
