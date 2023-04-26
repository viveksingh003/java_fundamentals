package com.java.basics.opeartors;

public class ShortCircuitOp1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 11;


        //10>10  //11>11
        if ((a++ > b) | (a++ > b)) { // a- 12

            System.out.println(a); // this will not execute because condition is  false

        } else {
            System.out.println(a); //12
        }
        System.out.println(a);//12

        //--short circuit op--------//
        // 11>12    //12>12
        if ((b++ > a) && (b++ > a)) { // b val -13

            System.out.println(b); // this will not execute because condition is  false

        } else {
            System.out.println(b); //12
        }
        System.out.println(b);//12
    }


}




