package ch10;

import java.util.ArrayList;
import java.util.Collections;

public class SortLambdaDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(9);
		arr.add(3);
		arr.add(5);
		Collections.sort(arr);

		System.out.println(arr);

		Collections.sort(arr, (a, b) -> b - a);
		System.out.println(arr);

		ArrayList<String> arrSt = new ArrayList<>();
		arrSt.add("zdz");
		arrSt.add("ccc");
		arrSt.add("abc");
		arrSt.add("ddd");
		arrSt.add("adf");

		Collections.sort(arrSt);
		System.out.println(arrSt);

		Collections.sort(arrSt, (a, b) -> b.compareTo(a));
		System.out.println(arrSt);

		ArrayList<Line> lineArr = new ArrayList<>();
		lineArr.add(new Line(5));
		lineArr.add(new Line(4));
		lineArr.add(new Line(2));
		lineArr.add(new Line(10));

		System.out.println(lineArr);
		Collections.sort(lineArr, (a, b) -> a.length - b.length);
		System.out.println(lineArr);

	}

}

class Line implements Comparable<Line> {
	int length;

	public Line(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%d", this.length);
	}

	@Override
	public int compareTo(Line o) {
		// TODO Auto-generated method stub
		return 0;
	}
}