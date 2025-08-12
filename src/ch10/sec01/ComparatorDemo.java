package ch10.sec01;

import java.util.Arrays;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "로마에 가면 로마법을 따르라", "시간은 금이다", "펜은 칼보다 강하다" };
		Arrays.sort(strs, (a, b) -> b.length() - a.length());
		System.out.println(Arrays.toString(strs));

	}

}
