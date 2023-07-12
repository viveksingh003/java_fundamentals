package com.java.oops.fundametals;

public class ParametrizedConstructorDemo {

    int empId;
    String name;


    ParametrizedConstructorDemo() {
        empId = 1;
        name = "vivek";

    }

//    public void setEmpId(int empId) {
//        this.empId = empId;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public int getEmpId() {
        return empId;
    }


    public String getName() {
        return name;
    }


    public static void main(String[] args) {

        ParametrizedConstructorDemo parametrizedConstructorDemo = new ParametrizedConstructorDemo();
        System.out.println("Name " + parametrizedConstructorDemo.getName());
        System.out.println("Emp_id " + parametrizedConstructorDemo.empId);
//        Name vivek  Emp_id 1
        parametrizedConstructorDemo.empId = 2;
        parametrizedConstructorDemo.name = "abcd";
        System.out.println("Name " + parametrizedConstructorDemo.getName());
        System.out.println("Emp_id " + parametrizedConstructorDemo.empId);
//        Name abcd Emp_id 2


    }
}
