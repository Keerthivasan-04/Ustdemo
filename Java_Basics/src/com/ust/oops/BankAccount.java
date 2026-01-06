package com.ust.oops;

public class BankAccount {
	String accountholderName;
	String accountNumber;
	double accountBalance;
	
	public BankAccount(String accountholderName, String accountNumber, double accountBalance) {
		this.accountholderName = accountholderName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public void deposit(double amount) {
		accountBalance += amount;
	}
	
	public void displayDetail() {
		System.out.println("Account Holder Name: " + accountholderName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Balance: " + accountBalance);
	}
}
