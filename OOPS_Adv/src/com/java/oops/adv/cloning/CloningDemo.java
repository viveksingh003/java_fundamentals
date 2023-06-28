package com.java.oops.adv.cloning;

public class CloningDemo implements Cloneable {

    int a = 10;
    CloningDemo(int a){
        this.a=a;
        System.out.println("value of a"+a);

    }

    void m1() {
        System.out.println("m1 method");
    }

    public Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return obj;

    }
}
class App3{
    public static void main(String[] args) throws Exception{
        CloningDemo obj=new CloningDemo(1);
        CloningDemo obj2=(CloningDemo)obj.clone();
        System.out.println("duplicate obj");
        obj2.m1();

    }
}


