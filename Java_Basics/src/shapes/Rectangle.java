package shapes;

public class Rectangle extends Shapes{
	
	double length;
	double breadth;

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	double calculateArea() {
		return length * breadth;
	}
	
	@Override
	double calculatePerimeter() {
		return 2 * (length + breadth);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", calculateArea()=" + calculateArea()
				+ ", calculatePerimeter()=" + calculatePerimeter() + "]";
	}
	
	
}
