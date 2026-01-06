package com.ust.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> carBrand = new Stack();
		carBrand.push("Volswagen");
		carBrand.push("Audi");
		carBrand.push("Volvo");
		
		System.out.println(carBrand.peek());
		
		carBrand.pop();
	
		System.out.println(carBrand.peek());
	}

}
