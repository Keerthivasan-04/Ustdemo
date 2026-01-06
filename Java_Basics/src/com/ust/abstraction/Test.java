package com.ust.abstraction;

public class Test {
	public static void main(String[] args) {

        MobileFunctions samsung = new Samsung();
        MobileFunctions apple = new Apple();

        System.out.println("---- Samsung ----");
        samsung.call();
        samsung.message();
        samsung.splitscreen();
        samsung.wirelesscharging();

        System.out.println("\n---- Apple ----");
        apple.call();
        apple.message();
        apple.splitscreen();      
        apple.wirelesscharging(); 
    }

}
