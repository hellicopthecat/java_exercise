package ch10;

import java.util.Arrays;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle[] rect = { new Rectangle(3, 4), new Rectangle(2, 10), new Rectangle(5, 6) };
		Arrays.sort(rect);
		System.out.println(Arrays.toString(rect));
		Arrays.sort(rect, (a, b) -> b.findArea() - a.findArea());
		System.out.println(Arrays.toString(rect));
	}

}

class Rectangle implements Comparable<Rectangle> {
	private int width, height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int findArea() {
		return width * height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("사각형[폭 = %d, 높이 = %d]", width, height);
	}

	@Override
	public int compareTo(Rectangle o) {
		// TODO Auto-generated method stub
		return this.findArea() - o.findArea();
	}
}