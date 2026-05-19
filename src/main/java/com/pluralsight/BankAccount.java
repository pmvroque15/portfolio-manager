package com.pluralsight;

public class BankAccount implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        this.balance += amount;

        return this.balance;
    }

    public double withdraw(double amount) {
         this.balance -= amount;

         return this.balance;
    }

    @Override
    public double getValue() {
        return this.balance;
    }
}
