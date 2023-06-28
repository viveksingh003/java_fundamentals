package com.java.oops.adv.dependencyinjection.entities;

public class Employ {
    private int eId;
    private String eName;
    private String eAddrs;
    private float eSal;
    private Account acc;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteAddrs() {
        return eAddrs;
    }

    public void seteAddrs(String eAddrs) {
        this.eAddrs = eAddrs;
    }

    public float geteSal() {
        return eSal;
    }

    public void seteSal(float eSal) {
        this.eSal = eSal;
    }

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
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
