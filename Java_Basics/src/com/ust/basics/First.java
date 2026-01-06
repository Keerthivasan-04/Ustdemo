package com.ust.basics;

import java.util.Scanner;

/**
 * Using for loop and if  print first 20 even numbers.
 * @author Kv
 *
 */

public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total count: ");
		int totalEvenNumbers= sc.nextInt();
		int count = 1;
		
		for(int i = 0; i < totalEvenNumbers; i++) {
			if(i % 2 == 0) {
				System.out.println(count +" - "+ i);
				totalEvenNumbers++;
				count++;
			}
		}

	}

}
