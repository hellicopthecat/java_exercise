package ch5;

import java.util.Arrays;

public class Ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = { "가위", "바위", "보" };
		System.out.println(name);
		System.out.println(Arrays.toString(name));
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 3);
			System.out.println(name[num]);
		}
	}
}
