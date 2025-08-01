package ch5;

public class ObjectArgumentDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(10.0);

		zero(c1);
		System.out.println(c1.radius);
		zero(c2);
		System.out.println(c2.radius);
	}

	static void zero(Circle c) {
		c.radius = 0.0;
	}

	static void zero(double r) {
		r = 0.0;
	}
}
