package com.java.oops.fundametals;

public class ForNameDemo {
    static {
        System.out.println("class loading");
    }

    ForNameDemo() {
        System.out.println("ForNameDemo Const. Called");
    }
}

class ForNameMain {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //class loading (Byte code loaded)
        Class c = Class.forName("com.java.oops.fundametals.ForNameDemo");
        Object obj=c.newInstance();//needs o-arg constructor<user_defined> or default not parametrized


    }
}
