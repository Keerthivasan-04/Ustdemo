package com.ust.basics;

import java.util.Scanner;

/**
 * We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. 
 * Return true if the given non-negative number is special. Use the % "mod" operator
 * specialEleven(22) → true
 * specialEleven(23) → true
 * specialEleven(24) → false
 * @author Kv
 *
 */
public class SpecialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
//		if(isSpecial(number)) {
//			System.out.println("Its a special number");
//		}
//		else {
//			System.out.println("Not");
//		}
		System.out.println(isSpecial(number));

	}

	private static boolean isSpecial(int number) {
		return (number % 11 == 0) || (number % 11 == 1);
		
	}

}
