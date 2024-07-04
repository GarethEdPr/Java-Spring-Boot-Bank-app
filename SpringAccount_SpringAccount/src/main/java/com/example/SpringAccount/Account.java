package com.example.SpringAccount;

public class Account {
    // instance variables 
    private double balance; 
    private Integer accountID;

    // Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Methods
    public void credit(double amount) {
        balance += amount;
    }

    public boolean debit(double amount) {
        if (balance - amount < 0)
            return false;
        else
            balance -= amount;
        return true;
    }

    // Getters & setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public Integer getAccountID() {
        return accountID;
    }

    @Override
    public String toString() {
        return "Account ID: " + accountID + ", Balance: " + balance;
    }
}
