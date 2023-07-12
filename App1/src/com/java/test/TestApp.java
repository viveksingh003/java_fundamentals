package com.java.test;

import com.java.entities.Account;
import com.java.entities.Transaction;

public class TestApp {

    public static void main(String[] args) {
        Account acc =new Account();
        acc.setAccNo("HDFC123");
        acc.setAccHolderName("Vivek");
        acc.setAccType("Saving");
        acc.setBal(123450);

        Transaction t=new Transaction();
        t.deposit(acc,1000);


    }
}
