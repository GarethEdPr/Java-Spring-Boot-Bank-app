/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringAccount;

/**
 *
 * @author Price
 */
public class SpecialInterestAccount extends InterestAccount {

    private double premiumInterestRate;
    private int transactionNumber;

    public SpecialInterestAccount(double balance, double monthlyInterestRateIn, double premiumInterestRateIn) {
        super(balance, monthlyInterestRateIn);
        this.transactionNumber = 0;
        this.premiumInterestRate = premiumInterestRateIn;
    }

    public void setPremiumInterestRate(double rate) {
        this.premiumInterestRate = rate;
    }

    public void transactionNumber(int sum) {
        transactionNumber++;
        credit(sum);
    }

    public double getpremiumInterestRate() {
        return premiumInterestRate;
    }

    public void creditNew(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount); // Use setBalance to add amount
            transactionNumber++;
        }
    }

    public boolean debitNew(double amount) {
        if (getBalance() - amount < 0)
            return false;
        else {
            setBalance(getBalance() - amount); // Use setBalance to subtract amount
            transactionNumber++;
            return true;
        }
    }

    public void calculateMonthlyInterest() {
        if (transactionNumber < 4 && premiumInterestRate > 0) {
            double premiumEarnings = getBalance() * (premiumInterestRate / 100);
            credit(premiumEarnings);
        } else if (transactionNumber >= 4 && getBalance() > 0) {
            double regularEarnings = getBalance() * (getRate() / 100);
            credit(regularEarnings);
        }
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    @Override
    public String toString() {
        return "Account details:\n" +
                "Account ID: " + getAccountID() + "\n" +
                "Monthly interest rate: " + getRate() + "\n" +
                "Premium interest rate: " + premiumInterestRate + "\n" +
                "Transaction count: " + transactionNumber + "\n" +
                "Overall balance: " + getBalance();
    }
}

