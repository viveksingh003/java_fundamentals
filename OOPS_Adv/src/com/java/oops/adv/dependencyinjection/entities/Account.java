package com.java.oops.adv.dependencyinjection.entities;

public class Account {
    private String accno;
    private String accHolderName;
    private String accType;
    private float accBal;

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public float getAccBal() {
        return accBal;
    }

    public void setAccBal(float accBal) {
        this.accBal = accBal;
    }
//set(xxx) and get(xxx)'


}
