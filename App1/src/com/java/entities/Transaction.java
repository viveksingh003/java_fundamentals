package com.java.entities;

public class Transaction {
    public void deposit(Account acc, double depositAmt){
        double totalBal=acc.getBal()+depositAmt;
        acc.setBal(totalBal);
        System.out.println("Transaction details");
        System.out.println();
        System.out.println("Account no "+acc.getAccNo());
        System.out.println("AccountHolderName "+acc.getAccHolderName());
        System.out.println("Trans type -DEPOSIT");
        System.out.println("Deposit Amnt "+depositAmt);
        System.out.println("Total Bal "+acc.getBal());

    }
}
