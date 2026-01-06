package com.ust.exception;

import java.util.Scanner;

/**
 * Power Calculator Exception Handling: 
 * Create a class MyCalculator which consists of a single method long power(int, int). 
 * This method takes two integers, n and p, as parameters and finds n^p. 
 * If either n or p is negative, then the method must throw an exception 
 * which says “n or p should not be negative”. 
 * Also, if both n and p are zero, then the method must throw an exception 
 * which says “n and p should not be zero”
 */

public class MyCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int p = sc.nextInt();
		
		try {
			
			System.out.println(power(n,p));
		}
		catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}

	}

	private static long power(int n, int p) {
		
		if(n == 0|| p== 0) {
			throw new RuntimeException("n and p should not be zero");
		}
		
		if(n < 0 || p < 0) {
			throw new RuntimeException("n or p should not be negative");
		}
		
		return n^p;
		
	}

}
