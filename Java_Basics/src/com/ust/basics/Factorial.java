package com.ust.basics;

import java.util.Scanner;
/**
 * Read a number from console and find factorial of that given number an print it on the console.
 * @author Kv
 *
 */

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		System.out.println(getfactorial(number));

   	}

	private static long getfactorial(int number) {
		long factorial = 1;
		if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
        }
		return factorial;
	}

}
