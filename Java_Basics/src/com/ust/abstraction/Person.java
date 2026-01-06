package com.ust.abstraction;

public class Person extends Invoice{

	@Override
	void calculateTax() {
		System.out.println("Tax is calculated!");
		
	}
}
