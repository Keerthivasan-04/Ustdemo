package shapes;

public class Circle extends Shapes {
	
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", calculateArea()=" + calculateArea() + ", calculatePerimeter()="
				+ calculatePerimeter() + "]";
	}
	
	
	

}
