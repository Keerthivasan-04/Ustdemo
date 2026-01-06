package com.ust.abstraction;

public abstract class Invoice {
	
	abstract void calculateTax();
	
	void applyDiscount() {
		System.out.println("Discount is applied...");
	}
	void getFinalPrice() {
		System.out.println("Final price...");
	}

}
