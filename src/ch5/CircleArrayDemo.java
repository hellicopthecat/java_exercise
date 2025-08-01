package ch5;

public class CircleArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] circle = new Circle[5];

		for (int i = 0; i < circle.length; i++) {
			circle[i] = new Circle(i + 5.0);
			System.out.println(circle[i]);
		}
	}

}

class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double findArea() {
		return 3.14 * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("원의 넓이 (반지름 : %.1f)  = %.1f\n", radius, findArea());
	}
}