package com.java.oops.adv.dependencyinjection.entities;

public class Employee {
    private int eId;
    private String eName;
    private String eAddrs;
    private float eSal;
    private Account acc;

    public Employee(int eId, String eName, String eAddrs, float eSal, Account acc) {
        this.eId = eId;
        this.eName = eName;
        this.eAddrs = eAddrs;
        this.eSal = eSal;
        this.acc = acc;
    }
    public void getEmpDetails(){
        System.out.println("Employee Details");
        System.out.println("EmpId "+eId);
        System.out.println("EmpName "+eName);
        System.out.println("EmpAddr "+eAddrs);
        System.out.println("EmpSal "+eSal);
        System.out.println();
        System.out.println("Account Details");
        System.out.println("AccountNo "+acc.getAccno());
        System.out.println("AccountType "+acc.getAccType());
        System.out.println("AccountHolderName "+acc.getAccHolderName());
        System.out.println("AccountBal "+acc.getAccBal());

    }




}
