package com.java.basics.statement;

public class Pattern3 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10 - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i + 1; k++) {
                System.out.print("*"+" ");
                //System.out.print("*");

            }
            System.out.println();
        }


    }
}

/*

 *
 **
 ***
 ****
 *****
 ******
 *******
 ********
 *********
 **********

 */

/*



 */
