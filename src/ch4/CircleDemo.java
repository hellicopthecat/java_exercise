package ch4;

public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(2);
		circle.getRadius();
//		circle.radius = 3;
		System.out.println(circle.findArea());
	}

}

//class Circle {
//	double radius;
//
//	double findArea() {
//		return 3.14 * radius * radius;
//	}
//}

class Circle {
	// 필드
	private double radius;

	// 생성자 추가
	public Circle(double r) {
		if (r > 0)
			this.radius = r;
	}

	// Getter
	public double getRadius() {
		System.out.println(radius);
		return radius;
	}

	// Setter
	public void setRadius(double rad) {
		if (rad <= 0) {
			System.out.println("0보다 커야합니다.");
			return;
		}
		this.radius = rad;
	}

	// Member (method)
	public double findArea() {
		return 3.14 * radius * radius;
	}
}