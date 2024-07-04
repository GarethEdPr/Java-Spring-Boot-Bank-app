package com.example.SpringAccount;

public class ChequeAccount extends Account {
    private double odl; // Overdraft Limit

    public ChequeAccount(double balance) {
        super(balance);
        odl = 0;  // Default overdraft limit
    }

    @Override
    public boolean debit(double amount) {
        if ((getBalance() - amount) >= -odl) {
            setBalance(getBalance() - amount);
            return true;
        } else {
            return false;
        }
    }

    public void setOdl(double odl) {
        this.odl = odl;
    }

    public double getOdl() {
        return odl;
    }

    @Override
    public String toString() {
        return super.toString() + ", ODL: " + odl;
    }
}
