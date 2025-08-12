package ch8;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sArr = { "케이크", "애플", "도넛", "바나나" };
		Integer[] iArr = { 3, 5, 1, 7 };
		Character[] cArr = { 'j', 'a', 'v', 'a' };
		print(sArr);
		print(iArr);
		print(cArr);

		Arrays.sort(sArr);
		System.out.println(Arrays.toString(sArr));
	}

	static void print(Object[] objArr) {
		System.out.print("[ ");
		for (Object obj : objArr) {
			System.out.print(obj + " ");
		}
		System.out.println("]");
	}

}
