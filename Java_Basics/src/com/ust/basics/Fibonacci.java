package com.ust.basics;

import java.util.Scanner;

/**
 * Create a function to get the Fibonacci series mentioned above and call it from the main function.
 * @author Kv
 *
 */

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		System.out.println(getFactorial(number));
	}

	private static int getFactorial(int number) {
            int firstTerm = 0, secondTerm = 1;
            System.out.print("Fibonacci series: ");

            for (int i = 1; i <= number; i++) {
                System.out.print(firstTerm + " ");
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
		return number;
	}
}
