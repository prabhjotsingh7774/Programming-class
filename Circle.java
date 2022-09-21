package Lab10;

public class Circle implements GeometricObject {
	// attributes
		protected double radius;

		/**
		 * Constructor
		 * 
		 * @param radius
		 */
		public Circle(double radius) {
			this.radius = radius;
		}

		/**
		 * @return String representation of Circle class
		 */
		@Override
		public String toString() {
			return "Circle[radius=" + radius + "]";
		}

		/**
		 * @return perimeter of circle
		 */
		@Override
		public double getPerimeter() {
			return 2 * Math.PI * radius;
		}

		/**
		 * @return area of circle
		 */
		@Override
		public double getArea() {
			return Math.PI * radius * radius;
		}

}
