package com.pluralsight;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double charge(double amount) {
         this.balance += amount;

         return this.balance;
    }

    public double pay(double amount) {
         this.balance -= amount;

         return this.balance;
    }

    @Override
    public double getValue() {
        return -1 * this.balance;
    }
}
