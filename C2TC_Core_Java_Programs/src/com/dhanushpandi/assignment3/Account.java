package com.dhanushpandi.assignment3;

abstract class Account {
    protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}


class SavingsAccount extends Account {
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in savings account.");
        }
    }

    public double getBalance() {
        return balance;
    }
}


class CheckingAccount extends Account {
    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in checking account.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

