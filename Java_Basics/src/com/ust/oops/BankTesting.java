package com.ust.oops;

public class BankTesting {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("SA101", "IAC254", 50000 , 5);
        sa.addInterest();
        sa.displayDetail();

        System.out.println();

        CurrentAccount ca = new CurrentAccount("CA201", "SQ123", 3000, 1000);
        ca.withdraw(3500);
        ca.displayDetail();

        System.out.println();

        LoanAccount la = new LoanAccount("LA301", "DE345" , 200000, 0);
        la.loandisplay();

	}

}
