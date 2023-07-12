package com.java.oops.adv.questions;

public class SuperClass {
    private int pr = 111;

    static int b = 10;

    int a = 10;

    int d = 45;

    void superClassMethod() {
        System.out.println("SuperClassMethod");

    }
}

class SubClass extends SuperClass {
    private int pr1 = 111;//private members can't be accessed outside the class
    int b = a;


    static int b1 = 30;
    int c = 11;

    void subClassMethod() {


        System.out.println("SubClassMethod");
    }


}

class Test1 {
    public static void main(String[] args) {
        int a = 9;
        a = 0;
        SubClass obj = new SubClass();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(SubClass.b1);
        obj.subClassMethod();
        System.out.println();
        //superclass
        System.out.println(obj.d);
        System.out.println(SuperClass.b);
        obj.superClassMethod();

/* by using subclass reference variable we are able to access
both super class members and subclass  members.*/

        SuperClass obj1 = new SuperClass();
        System.out.println(obj1.a);
        System.out.println(obj1.d);
        System.out.println(obj1.b);
        System.out.println(SuperClass.b);
        obj1.superClassMethod();
/*using super class reference variable we are able to access
only super class members */

        // calling when name same but want  to access specic class member
        System.out.println(((SuperClass) obj).a);//***


    }

}
