package com.java.oops.fundametals;

public class SingletonDesignPattern {
    private static SingletonDesignPattern obj = null;

    static {
        obj = new SingletonDesignPattern();
    }

    static SingletonDesignPattern getRef() {
        return obj;
    }

}

class SingletonDesignPattern1 {
    public static void main(String[] args) {
        SingletonDesignPattern obj1 = SingletonDesignPattern.getRef();
        SingletonDesignPattern obj2 = SingletonDesignPattern.getRef();
        SingletonDesignPattern obj3 = SingletonDesignPattern.getRef();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);


    }
}
