package com.ust.oops;

public class LoanAccount extends BankAccount {
	
	double loan;

	public LoanAccount(String accountholderName, String accountNumber, double accountBalance, double loan) {
		super(accountholderName, accountNumber, accountBalance);
		this.loan = loan;
	}
	
	public void loandisplay() {
		System.out.println("Loan Amount: " + loan);
	}

}
