package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Pricing class contains the main logic for the Pricing Rule Engine.
 * It allows users to:
 * 1. Add products
 * 2. Apply discount rules
 * 3. View summary by category
 */


public class Pricing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<>();
        int choice;
        
        do {
        	System.out.println("\n------- Pricing Rule -------");
        	System.out.println("1. Add Product");
        	System.out.println("2. View summary");
        	System.out.println("3. Exit");
        	System.out.println("Enter your choice: ");
        	//System.out.println("----------------------------");
        	
        	choice = sc.nextInt();
        	sc.nextLine(); //consume new line
        	
        	switch(choice) {
        	
        	case 1:
        		addProduct(sc,productList);
        		break;
        	
        	case 2:
        		viewSummary(productList);
        		break;
        		
        	case 3:
        		System.out.println("Exiting Application");
        		break;
        		
        	default:
        		System.out.println("Invalid choice. Try again!");
        	}
        	
        }while(choice != 3);

	}
	
	// === Validation Methods ===
	private static void validatePrice(double productPrice) {
		if(productPrice < 0) {
			throw new IllegalArgumentException("Price must be greater than zero");
		}
	}
	
	private static boolean isValidCategory(String productCategory) {
		return productCategory.equalsIgnoreCase("Electronics") || productCategory.equalsIgnoreCase("Clothing") || productCategory.equalsIgnoreCase("Food");
	}
	
	// === Business Methods ===
	private static void addProduct(Scanner sc, ArrayList<Product> productList) {
		
		System.out.println("Enter Product Name: ");
		String productNameString = sc.nextLine();
		
		System.out.println("Enter Product Category: (Electronics / Clothing / Food) ");
		String productCategory = sc.nextLine();
		
		if (!isValidCategory(productCategory)) {
		    System.out.println("Invalid category. Product not added. Try (Electronics / Clothing / Food)");
		    return;
		}
		
		
		System.out.println("Product Price: ");
		double productPrice = sc.nextDouble();
		sc.nextLine(); // consumes new line
		
		validatePrice(productPrice);
		
		
		Product product = new Product(productNameString, productCategory, productPrice);
		applyDiscount(product);
		productList.add(product);
		System.out.println();
		System.out.println("Product added successfully");
	}

	

	private static void applyDiscount(Product product) {
		
		if(product.category.equalsIgnoreCase("Electronics") && product.price > 1000) {
			product.discountedPrice = product.price * 0.90; //10% discount
		}
		
		else if(product.category.equalsIgnoreCase("Clothing") && product.price > 500) {
			product.discountedPrice = product.price * 0.85; //15% discount
		}
		
		else if(product.category.equalsIgnoreCase("Food") && product.price > 100) {
			product.discountedPrice= product.price * 0.95; //5% discount
		}
		else {
			product.discountedPrice = product.price;
		}
	}

	private static void viewSummary(ArrayList<Product> productList) {
		
		double electronicsTotal = 0;
		double clothingTotal = 0;
		double foodTotal = 0;
		
		System.out.println("\n------- Product Summary -------");
		
		for(Product p : productList) {
			System.out.println(p.name + " | " + p.category + " | " + "Original: "+ p.price + " | Final: "+p.discountedPrice);
			
			if(p.category.equalsIgnoreCase("Electronics")) {
				electronicsTotal += p.discountedPrice;
			}
			
			else if(p.category.equalsIgnoreCase("Clothing")) {
				clothingTotal += p.discountedPrice;
			}
			
			else if(p.category.equalsIgnoreCase("Food")) {
				foodTotal += p.discountedPrice;
			}	
		}
		
		System.out.println("\n--- Total by Category ---");
		System.out.println("Electronics: " +electronicsTotal);
		System.out.println("Clothing: "+ clothingTotal);
		System.out.println("Food: " + foodTotal);
	}
}
