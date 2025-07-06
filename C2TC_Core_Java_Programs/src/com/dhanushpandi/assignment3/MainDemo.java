package com.dhanushpandi.assignment3;

public class MainDemo {
		    public static void main(String[] args) {
	        // Static: Bank accounts tracking
	        Bank bank1 = new Bank();
	        Bank bank2 = new Bank();
	        System.out.println("Total Bank Accounts: " + Bank.getTotalAccounts());

	        // Abstract: Account operations
	        SavingsAccount sa = new SavingsAccount("Alice", 5000);
	        CheckingAccount ca = new CheckingAccount("Bob", 3000);

	        sa.displayAccountInfo();
	        ca.displayAccountInfo();

	        // Final: Transaction
	        Transaction txn = new Transaction();

	        txn.performTransaction(sa, 1000, true);  // deposit
	        txn.performTransaction(ca, 500, false);  // withdraw

	        sa.displayAccountInfo();
	        ca.displayAccountInfo();
	    }
	}


