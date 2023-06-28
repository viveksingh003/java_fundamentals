package com.java.oops.adv.test;

import com.java.oops.adv.entities.Account;
import com.java.oops.adv.entities.Employee;

public class Test {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAcc_holder_name("Vivek");
        acc.setAcc_no("acc1234");
        acc.setAcc_type("saving");
        acc.setBal(1234.56f);

        Employee e = new Employee();
        e.seteId(1111);
        e.seteName("vivek");
        e.setAcc(acc);
        e.seteAddress("Patna");
        e.seteSal(12345);
        e.getEmpdetails();

    }
}
