package com.ust.abstraction;

public class Samsung implements MobileFunctions{
	@Override
	public void call() {
		System.out.println("Calling via samsung.......");
		
	}

	@Override
	public void message() {
		System.out.println("Message sending via samsung...");
	}
	
	public void splitscreen() {
		System.out.println("Split screen Loading... ");
	}
	
	
}
