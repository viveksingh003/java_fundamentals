package com.java.oops.adv.entities;

public class Employee {

    private int eId;
    private String eName;
    private float eSal;
    private String eAddress;
    private Account acc; //one to one association

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }


    // Address[] addr;// one to many association

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

    public float geteSal() {
        return eSal;
    }

    public void seteSal(float eSal) {
        this.eSal = eSal;
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    public void getEmpdetails() {
        System.out.println("Emp Details \n");
        System.out.println("EmployeeId " + eId);
        System.out.println("EmployeeName " + eName);
        System.out.println("Employeesal " + eSal);
        System.out.println("EmployeeAddress " + eAddress);
        System.out.println();
        System.out.println("Account Details\n");
        System.out.println("AccountNo " + acc.getAcc_no());
        System.out.println("AccountType " + acc.getAcc_type());
        System.out.println("AccountHolderName  " + acc.getAcc_holder_name());
        System.out.println("AccountBal " + acc.getBal());

    }


}
