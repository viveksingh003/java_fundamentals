package com.java.oops.adv.dependencyinjection.test;

import com.java.oops.adv.dependencyinjection.entities.Account;
import com.java.oops.adv.dependencyinjection.entities.Employee;

public class Test {
    public static void main(String[] args) {
        Account accc=new Account();
        accc.setAccBal(1111.0f);
        accc.setAccno("HDFC12222");
        accc.setAccHolderName("Abhi");
        accc.setAccType("saving");
        Employee emp=new Employee(123,"Abhi","patna",12222.0f,accc);
        emp.getEmpDetails();
    }
}
