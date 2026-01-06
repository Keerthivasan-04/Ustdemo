package com.ust.polymorphism;

import java.util.Scanner;

import com.ust.interfaces.Circle;
import com.ust.interfaces.Rectangle;
import com.ust.interfaces.Shapes;

public class Test {

	public static void main(String[] args) {

		Vehicle v1 = new Car();
		v1.makeSound();
		v1 = new Truck();
		v1.makeSound();
		
		
		System.out.println("--------------------------");

		Vehicle vehicle = null;
		int choice = 0;
		System.out.println("1. Car");
		System.out.println("2. Truck");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option: ");
		choice = sc.nextInt();
		
		if(choice == 1) {
			vehicle = new Car();
		}
		else if(choice == 2) {
			vehicle = new Truck();
		}
		vehicle.makeSound();
		
		
		
		

	}

}
