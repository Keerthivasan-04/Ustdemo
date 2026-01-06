package com.ust.exception;

import java.util.Scanner;

/**
 * Write a Java program to create a method that takes an integer as a parameter 
 * and throws an exception if the number is odd.
 */

public class Excercise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		try {
			if(n % 2 == 1) {
				throw new Exception("Number is odd.");
			}
			else {
				System.out.println("Number is even");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());;
		}

	}

}
