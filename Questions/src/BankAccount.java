

/*
Create a class called "BankAccount" with attributes: accountNumber, accountHolderName, and balance.
Implement methods for deposit and withdrawal.
 Create an instance of the "BankAccount" class, perform some deposits and withdrawals, and display the final balance.
 */

public class BankAccount {
    int accountNumber;
    String accountHolderName;
    float balance=1000;
    float deposit(float balance){
        return this.balance+balance;

    }
    float withdrawal(float balance){
        return balance;


    }

    public static void main(String[] args) {
        BankAccount sbi=new BankAccount();
        float dep=sbi.deposit(10000);
        float withdrwl=sbi.withdrawal(500);
        System.out.println("final bal "+(dep-withdrwl));
        System.out.println(sbi.deposit(10000)-sbi.withdrawal(500));
    }

}
