package com.java.oops.adv.abst;

public abstract class AbstrDemo {

    protected abstract void m1();

}
abstract class AbstrDemo1 extends AbstrDemo{
    public abstract void m1();

}
class TestApp{
    public static void main(String[] args) {
        AbstrDemo1 a=new AbstrDemo1() {
            @Override
            public void m1() {
                System.out.println("eded");
            }
        };
        AbstrDemo1 d=  a;
        System.out.println(d);
        System.out.println(a);
        a.m1();
        d.m1();
    }
}
