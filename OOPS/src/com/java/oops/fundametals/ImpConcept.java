package com.java.oops.fundametals;

public class ImpConcept {
    private ImpConcept() {
        System.out.println("constructor is private won't be able to create object in other class");
    }
    //public ImpConcept(int a){}


    void m1() {
        System.out.println("m1 method should be non static");
    }

    static ImpConcept getRef() {
        ImpConcept a = new ImpConcept();
        return a;
    }


}

class ImpConcept1 {
    public static void main(String[] args) {
        //without creating object of class ImpConcept we have to call m1
        ImpConcept imp = ImpConcept.getRef();
        imp.m1();
        //    ImpConcept imp1=new ImpConcept(10);

    }
}