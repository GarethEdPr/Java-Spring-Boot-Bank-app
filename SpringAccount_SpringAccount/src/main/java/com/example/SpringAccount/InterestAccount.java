package com.example.SpringAccount;

public class InterestAccount extends Account {
    private double monthlyInterestRate;

    public InterestAccount(double balance, double monthlyInterestRate) {
        super(balance);
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public void addMonthlyInterest() {
        double interest = getBalance() * (monthlyInterestRate / 100.0);
        credit(interest);
    }

    public double getRate() {
        return monthlyInterestRate;
    }

    public void setRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    @Override
    public String toString() {
        return String.format("Balance: %.2f, Monthly Interest Rate: %.2f%%", getBalance(), monthlyInterestRate);
    }
}
