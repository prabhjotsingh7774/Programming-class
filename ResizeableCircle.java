package Lab10;

public class ResizeableCircle extends Circle implements Resizable{
	public ResizeableCircle(double radius) {
		// call to super class Circle constructor
		super(radius);
	}

	/**
	 * @return String representation of ResizeableCircle class
	 */
	@Override
	public String toString() {
		return "ResizeableCircle[" + super.toString() + "]";
	}

	/**
	 * resize the radius by percent
	 * 
	 * @param percent
	 */
	@Override
	public void resize(int percent) {
		radius *= percent / 100.0;
	}

}
