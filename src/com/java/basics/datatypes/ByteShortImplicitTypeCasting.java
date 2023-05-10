package com.java.basics.datatypes;

public class ByteShortImplicitTypeCasting {

    public static void main(String[] args) {
        byte b = 65;
        // char c=b;//java: incompatible types: possible lossy conversion from byte to char
        short s = 65;
        // char c1=s;//java: incompatible types: possible lossy conversion from short to char

        int a = 65;
        //char c2 = a;//java: incompatible types: possible lossy conversion from int to char


    }
}
