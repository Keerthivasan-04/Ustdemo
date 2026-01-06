package com.ust.interfaces;

import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {
		Shapes s = new Rectangle();
		Shapes s1 = new Circle();
		
		s.draw();
		s1.draw();
		
		System.out.println("--------------------------");
		Shapes s2 =  null;
		int choice = 0;
		System.out.println("1. Rectangle");
		System.out.println("2. Circle");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option: ");
		choice = sc.nextInt();
		
		if(choice == 1) {
			s2 = new Rectangle();
		}
		else if(choice == 2) {
			s2 = new Circle();
		}
		s2.draw();
	}

}
