package ch4.sec07;

public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Circle.numOfCircles);

		Circle c1 = new Circle(20);
		System.out.println(c1.numCircles);
		System.out.println(c1.numOfCircles);
		Circle c2 = new Circle(20);
		System.out.println(c2.numCircles);
		System.out.println(c2.numOfCircles);

	}

}

class Circle {
	// instance varialble
	double radius;
	int numCircles = 0;
	// static varialble (static, class)
	static int numOfCircles = 0;

	// constructor
	public Circle(double radius) {
		this.radius = radius;
		numCircles++;
		numOfCircles++;
	}
	// instance method
}