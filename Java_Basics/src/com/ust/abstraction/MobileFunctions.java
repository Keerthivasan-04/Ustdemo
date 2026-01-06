package com.ust.abstraction;

public interface MobileFunctions {
	
	void call();
	void message();
	
	default void splitscreen() {
		System.out.println("Function is not ready");
	}
	
	default void wirelesscharging() {
		System.out.println("Wireless charging not supported");
	}

}
