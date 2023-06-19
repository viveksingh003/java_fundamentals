package com.java.oops.fundametals;

public class FinalKeywordDemo {

    static final int i = 1000;
    final int j = 10;

    public static void main(String[] args) {

        //i=10;
        //Cannot assign a value to final variable 'i'
        FinalKeywordDemo finalKeywordDemo = new FinalKeywordDemo();
        //finalKeywordDemo.j=101;
        //Cannot assign a value to final variable 'j'
        //FinalKeywordDemo.i=10000;
        //Cannot assign a value to final variable 'i'


    }
}
