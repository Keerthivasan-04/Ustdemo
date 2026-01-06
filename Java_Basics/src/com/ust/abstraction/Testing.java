package com.ust.abstraction;

public class Testing {
	public static void main(String[] args) {
		Invoice invoice = new Person(); 

	    invoice.calculateTax();    
	    invoice.applyDiscount();   
	    invoice.getFinalPrice();   
	}
	
}
