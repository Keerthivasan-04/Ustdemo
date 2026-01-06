package com.ust.exception;

import java.util.Scanner;

/**
 * Ex4:
Problem Statement:
	Create a custom exception class InsufficientBalanceException that extends the Exception class. 
	This exception should be thrown when a user tries to withdraw an amount that exceeds their account balance.
Requirements:
	Create a BankAccount class with a withdraw method that takes an amount as input.
	If the withdrawal amount exceeds the account balance, throw an InsufficientBalanceException with a suitable error message.
	Handle the custom exception in the main method and print the error message.
Example Use Case:
	A user has a balance of ₹1000 and tries to withdraw ₹1500.
	The withdraw method throws an InsufficientBalanceException with the message "Insufficient balance in your account".
 
 */


public class BankAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Current Balance: ");
		double balance = sc.nextDouble();
		
		System.out.println("Withdraw Amount");
		double withdrawalAmount = sc.nextDouble(); 
		
		
		try {
			balance = withdraw(balance , withdrawalAmount);
			System.out.println("Remaining Balance: " + balance);
		}
		catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
		
	}
	
	private static double withdraw(double balance, double withdrawalAmount) 
			throws InsufficientBalanceException{
		
		if(withdrawalAmount <= 0) {
			throw new InsufficientBalanceException("Withdrawal Amount must be positive");
		}
		
		if(withdrawalAmount > balance) {
			throw new InsufficientBalanceException("Insufficient balance in your account");
		}
		
		return 	balance - withdrawalAmount;
	}
		

}


