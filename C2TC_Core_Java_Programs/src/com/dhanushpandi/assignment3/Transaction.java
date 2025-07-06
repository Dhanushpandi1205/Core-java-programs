package com.dhanushpandi.assignment3;

class Transaction {
    // Final variable
    private final double transactionFee = 10.0;

    // Final method to perform transaction
    public final void performTransaction(Account acc, double amount, boolean isDeposit) {
        if (isDeposit) {
            acc.deposit(amount);
        } else {
            acc.withdraw(amount + transactionFee); // fee on withdrawal
        }
        System.out.println("Transaction complete. Current balance: ₹" + acc.getBalance());
    }

    public double getTransactionFee() {
        return transactionFee;
    }
}
