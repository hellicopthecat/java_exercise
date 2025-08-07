package ch7.EX;

public class TriangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle(10, 20); // 100
		Triangle t2 = new Triangle(30, 20); // 300
		int a = t1.compareTo(t2);
		int b = t2.compareTo(t1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(t1);
		System.out.println(t2);
	}

}

class Triangle implements Comparable<Triangle> {
	int width;
	int height;

	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int findArea() {
		return (this.width * this.height) / 2;
	}

	@Override
	public int compareTo(Triangle t) {
		// TODO Auto-generated method stub
		return this.findArea() - t.findArea();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[width  = %d , height = %d , 넓이 = %d]", this.width, this.height, this.findArea());
	}
}