package com.java.basics.datatypes;

public class DataTypeMinMax {

    public static void main(String[] args) {

        System.out.println(Byte.MAX_VALUE + " -------  " + Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE + " ------  " + Short.MIN_VALUE);
        System.out.println(Long.MAX_VALUE + " ------  " + Long.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + " ------  " + Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE + " ------  " + Double.MIN_VALUE);
        System.out.println(Character.MAX_VALUE + " ------  " + Character.MIN_VALUE);
        //System.out.println(Boolean.MAX_VALUE+" ------  "+Boolean.MIN_VALUE); // compilation err
/*

127 -------  -128
32767 ------  -32768
9223372036854775807 ------  -9223372036854775808
2147483647 ------  -2147483648
1.7976931348623157E308 ------  4.9E-324
￿ ------   

 */

    }
}
