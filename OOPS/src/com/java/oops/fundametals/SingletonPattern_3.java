package com.java.oops.fundametals;

public class SingletonPattern_3 {
    private static SingletonPattern_3 s = new SingletonPattern_3();

    private SingletonPattern_3() {

    }

    static SingletonPattern_3 getRef() {
        return s;
    }
}

class SingletonPattern_3_1 {
    public static void main(String[] args) {
        SingletonPattern_3 s1 = SingletonPattern_3.getRef();
        SingletonPattern_3 s2 = SingletonPattern_3.getRef();
        SingletonPattern_3 s3 = SingletonPattern_3.getRef();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
