package com.ust.oops;

public class SavingsAccount extends BankAccount {
	
	double interestRate;

	public SavingsAccount(String accountholderName, String accountNumber, double accountBalance, double interestRate) {
		super(accountholderName, accountNumber, accountBalance);
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		accountBalance += accountBalance * interestRate / 100;
	}
}
