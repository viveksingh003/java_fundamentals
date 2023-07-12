package com.java.oops.fundametals;

public class ToStringDemo {

    int id = 1234;
    String name = "vivek";
    String address = "Kankarbagh";

    public String toString() {
        System.out.println("Id " + id + " Name " + name + " Address " + address);
        return "";
    }

    public static void main(String[] args) {
        ToStringDemo toStringDemo = new ToStringDemo();
        //System.out.println(toStringDemo); when not overridden
        //com.java.oops.fundametals.ToStringDemo@1540e19d
        System.out.println(toStringDemo);
        //Id 1234 Name vivek Address Kankarbagh
    }


}
