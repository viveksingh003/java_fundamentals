package com.java.oops.adv.instncof;

import com.java.oops.adv.interfc.I;

public class InstanceofDemo {

    void m1() {
    }

    ;

}

class ChildInstanceofDemo extends InstanceofDemo {
    void m2() {
    }
}

class ChildInstanceofDemo1 extends ChildInstanceofDemo {
}

class App2 {

    public static void main(String[] args) {
        ChildInstanceofDemo obj = new ChildInstanceofDemo();
        InstanceofDemo instobj = new InstanceofDemo();
        System.out.println(instobj instanceof ChildInstanceofDemo);//false
        System.out.println(instobj instanceof InstanceofDemo);//true
        System.out.println(obj instanceof ChildInstanceofDemo);//true
    }

}
