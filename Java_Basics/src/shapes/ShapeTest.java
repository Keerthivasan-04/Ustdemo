package shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {
		Shapes circle = new Circle(5.0);
		Shapes rectangle = new Rectangle(7.0, 3.0);

		List<Shapes> shapes = new ArrayList<>();
		shapes.add(circle);
		shapes.add(rectangle);

		for (Shapes s : shapes) {
			System.out.println(s);
		}

	}

}
