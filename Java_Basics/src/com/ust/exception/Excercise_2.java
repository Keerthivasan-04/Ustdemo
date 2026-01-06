package com.ust.exception;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Write a Java program that reads a list of integers from the user 
 * and throws an exception if any numbers are duplicates.
 */

public class Excercise_2 {

	public static void main(String[] args) {
		try {
	        readAndCheck();
	    } catch (RuntimeException ex) {
	        System.out.println(ex.getMessage());
	    }	
	}
	
	static void readAndCheck() throws RuntimeException {
	    Scanner sc = new Scanner(System.in);
	    Set<Integer> numbers = new HashSet<>();

	    System.out.print("Enter size: ");
	    int n = sc.nextInt();

	    for (int i = 0; i < n; i++) {
	        int num = sc.nextInt();
	        if (!numbers.add(num)) {
	            throw new RuntimeException("Duplicate number found: " + num);
	        }
	    }
		
		
		
//		Scanner sc = new Scanner(System.in);
//        Set<Integer> numbers = new HashSet<>();
//
//        System.out.print("Enter size: ");
//        int n = sc.nextInt();
//
//        try {
//            for (int i = 0; i < n; i++) {
//                System.out.print("Enter number: ");
//                int num = sc.nextInt();
//                sc.nextLine();
//
//                if (!numbers.add(num)) {
//                    throw new RuntimeException("Duplicate number found: " + num);
//                }
//            }
//
//            System.out.println("All numbers are unique.");
//
//        } catch (RuntimeException ex) {
//            System.out.println(ex.getMessage());
//        }

	}

}
