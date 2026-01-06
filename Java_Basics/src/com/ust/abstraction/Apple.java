package com.ust.abstraction;

public class Apple implements MobileFunctions{

	@Override
	public void call() {
		System.out.println("Calling by iphone...");
		
	}

	@Override
	public void message() {
		System.out.println("Message sending via iphone...");
		
	}
	
	public void wirelesscharging() {
		System.out.println("Wireless Charging...");
	}
	
	

}
