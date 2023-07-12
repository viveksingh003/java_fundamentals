package com.java.oops.fundametals;

public class SingletonDesignPattern_2 {
    private static SingletonDesignPattern_2 obj = null;

    private SingletonDesignPattern_2() {
    }

    static SingletonDesignPattern_2 getRef() {
        if (obj == null) {
            obj = new SingletonDesignPattern_2();
        }
        return obj;

    }

}

class SingletonDesignPattern_2_1 {
    public static void main(String[] args) {


        SingletonDesignPattern_2 obj1 = SingletonDesignPattern_2.getRef();
        SingletonDesignPattern_2 obj2 = SingletonDesignPattern_2.getRef();
        SingletonDesignPattern_2 obj3 = SingletonDesignPattern_2.getRef();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}