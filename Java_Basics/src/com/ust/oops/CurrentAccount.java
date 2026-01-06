package com.ust.oops;

public class CurrentAccount extends BankAccount {
	
	double overDraftLimit;
	
	public CurrentAccount(String accountholderName, String accountNumber, double accountBalance,
			double overDraftLimit) {
		
		super(accountholderName, accountNumber, accountBalance);
		this.overDraftLimit = overDraftLimit;
		
	}
	
	public void withdraw(double amount) {
		if(accountBalance + overDraftLimit >= amount) {
			accountBalance -= amount;
		}
		else {
			System.out.println("Limit Exceeded");
		}
	}
}
