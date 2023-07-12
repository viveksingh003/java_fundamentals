package com.java.oops.fundametals;

public class ParametrizedConstructorDemo1 {
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    int empId;
    String name;


    ParametrizedConstructorDemo1(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public static void main(String[] args) {
        ParametrizedConstructorDemo1 parametrizedConstructorDemo1 = new ParametrizedConstructorDemo1(1, "Vivek");
        ParametrizedConstructorDemo1 parametrizedConstructorDemo2 = new ParametrizedConstructorDemo1(2, "Abhi");
        System.out.println("EmpId " + parametrizedConstructorDemo1.getEmpId());
        System.out.println("Name " + parametrizedConstructorDemo1.getName());

        System.out.println("EmpId " + parametrizedConstructorDemo2.getEmpId());
        System.out.println("Name " + parametrizedConstructorDemo2.getName());
    }
}
