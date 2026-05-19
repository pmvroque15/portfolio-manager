package com.pluralsight;

public class FinanceApplication {
    public static void main(String[] args) {


        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456", 1500);
// try to deposit money into both accounts
        account1.deposit(100);



        if (account2 instanceof Valuable) {
            BankAccount bank = (BankAccount) account2;
            bank.deposit(100);
        }

        System.out.println(account1.getValue());
        account1.withdraw(700);
        System.out.println(account1.getValue());


    }
}