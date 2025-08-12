package ch10.exs;

import java.text.MessageFormat;
import java.util.ArrayList;

public class EX_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자를 원소를 가지는 ArrayList 작성. 원소를 4개를 추가하는데 +:2개 -2개
		// 음수값은 삭제하고 양수값만 남겨놓고 남아있는 원소를 전부 출력
		ArrayList<Integer> ints = new ArrayList<>();
		ints.add(5);
		ints.add(9);
		ints.add(-20);
		ints.add(-10);
		ints.removeIf((nums) -> nums < 1);
		System.out.println(ints);

		// 객체 삼각형 -> ArrayList. 원소를 3개를 추가하는데 길이가 3,7,4,
		// 넓이 20보다 작은 것은 삭제 남아 있는 원소를 전부 출력

		ArrayList<Triangle> triangleArr = new ArrayList<>();
		triangleArr.add(new Triangle(10, 23));
		triangleArr.add(new Triangle(5, 7));
		triangleArr.add(new Triangle(30, 15));
		triangleArr.add(new Triangle(10, 10));

		System.out.println(triangleArr);
		triangleArr.removeIf((tri) -> tri.getArea() < 20);
		System.out.println(triangleArr);

	}

}

class Triangle {
	private double width;
	private double height;

	public Triangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	double getArea() {
		return width * height / 2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return MessageFormat.format("[넓이 : {0}]", this.getArea());
	}
}