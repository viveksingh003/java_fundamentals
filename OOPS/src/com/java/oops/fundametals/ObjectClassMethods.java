package com.java.oops.fundametals;

public class ObjectClassMethods {
    public static void main(String[] args) {
        ObjectClassMethods ob = new ObjectClassMethods();
        ObjectClassMethods ob1 = new ObjectClassMethods();
        System.out.println(ob.getClass() + "  " + ob.equals(ob1)

        );

        //System.out.println(ob.finalize());
        /*Called by the garbage collector on an object
        when garbage collection determines that
        there are no more references to the object
         */
    }

}
