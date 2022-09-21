package Lab10;

public class GeometricObjectDriver {

	public static void main(String[] args) {
		// create an instance of Circle class
				Circle circle = new Circle(10.5);
				// print the circle instance details
				System.out.println("Circle Details:");
				System.out.println(circle);
				System.out.println("Area of circle: "+circle.getArea());
				System.out.println("Perimeter of circle: "+circle.getPerimeter());
				
				// create an instance of ResizeableCircle class 
				ResizeableCircle resizeableCircle = new ResizeableCircle(circle.radius);
				// print the ResizeableCircle instance details
				System.out.println("ResizeableCircle Details:");
				System.out.println(resizeableCircle);
				System.out.println("Calling resize method with 5 percent");
				// call resize method
				resizeableCircle.resize(5);
				// print new details
				System.out.println(resizeableCircle);
			}
	}


