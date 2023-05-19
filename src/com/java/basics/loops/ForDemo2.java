package com.java.basics.loops;

public class ForDemo2 {
    public static void main(String[] args) {
        System.out.println("before loop1");
        for (int i=0;i<=5 |i>=5;i++){
            System.out.println(i);
        }
        System.out.println("after loop1");


       System.out.println("before loop2");
        for (int i=0;true;i++){ // true or no condition<by def true>
        System.out.println(i);
    }
      //System.out.println("after loop2"); //  Unreachable statement
}

}
