package com.java.oops.fundametals;

public class ThisDemoReturnCassObj {

    ThisDemoReturnCassObj getRef() {
        ThisDemoReturnCassObj obj = new ThisDemoReturnCassObj();
        return obj;
    }

    ThisDemoReturnCassObj getRef2() {
        return this;
    }


    public static void main(String[] args) {
        ThisDemoReturnCassObj obj = new ThisDemoReturnCassObj();
        System.out.println(obj);
        System.out.println(obj.getRef());
        System.out.println(obj.getRef());
/* 3 obj
com.java.oops.fundametals.ThisDemoReturnCassObj@1540e19d
com.java.oops.fundametals.ThisDemoReturnCassObj@677327b6
com.java.oops.fundametals.ThisDemoReturnCassObj@14ae5a5
 */
        System.out.println();
        System.out.println(obj.getRef2());
        System.out.println(obj.getRef2());
    }
/*
com.java.oops.fundametals.ThisDemoReturnCassObj@1540e19d
com.java.oops.fundametals.ThisDemoReturnCassObj@677327b6
com.java.oops.fundametals.ThisDemoReturnCassObj@14ae5a5

com.java.oops.fundametals.ThisDemoReturnCassObj@1540e19d
com.java.oops.fundametals.ThisDemoReturnCassObj@1540e19d
 */

}
