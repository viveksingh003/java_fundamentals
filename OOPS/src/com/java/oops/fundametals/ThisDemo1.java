package com.java.oops.fundametals;

public class ThisDemo1 {

    private int empID;
    private String name;

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        ThisDemo1 thisDemo1 = new ThisDemo1();
        thisDemo1.setName("Vivek");
        thisDemo1.setEmpID(001);
        System.out.println("Emp_Id :" + thisDemo1.getEmpID());
        System.out.println("Name :" + thisDemo1.getName());
    }
}
