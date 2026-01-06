package test;

/**
 * Product class represents a single product item
 * with name, category, original price, and discounted price.
 */


public class Product {
	String name;
	String category;
	double price;
	double discountedPrice;
	
	public Product(String name, String category, double price) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.discountedPrice = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	
	

}
