package com.java.oops.adv.dependencyinjection.test;

import com.java.oops.adv.dependencyinjection.entities.Account;
import com.java.oops.adv.dependencyinjection.entities.Employ;

public class Test2 {
    public static void main(String[] args) {
        Account accc=new Account();
        accc.setAccBal(1111.0f);
        accc.setAccno("HDFC12222");
        accc.setAccHolderName("Abhi");
        accc.setAccType("saving");

        Employ e=new Employ();
        e.seteId(111);
        e.seteAddrs("Blr");
        e.seteName("Abhi");
        e.seteSal(11222.0f);
        e.setAcc(accc);
        e.getEmpDetails();
    }
}
