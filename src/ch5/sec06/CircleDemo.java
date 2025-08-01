package ch5.sec06;

public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Circle c2 = new Circle(10.0);
		Circle c3 = new Circle("red");
		Circle c4 = new Circle(13.0, "blue");
		c1.info();
		c2.info();
		c3.info();
		c4.info();

	}

}

class Circle {
	double radius;
	String color;

	public Circle() {
//		this.radius = 5.0;
//		this.color = "Yellow";
		this(30.0, "Green");
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(String color) {
		this.color = color;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public void info() {
		System.out.printf("원의 반지름은 %.1f 이고 색깔은 %s 입니다.\n", this.radius, this.color);
	}
}