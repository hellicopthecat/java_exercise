package ch3;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		//
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);

//		for (int index = 0; index < 10; index++) {
//			System.out.println(index + 1);
//		}
//
//		for (int i = 11; i <= 20; i++) {
//			System.out.println(i);
//		}

//		for (int i = 1; i < 10; i++) {
//			System.out.printf("%d * %d = %d \n", 2, i, 2 * i);
//		}
		Scanner scan = new Scanner(System.in);
		System.out.println("출력하고자하는 구구단 단수를 입력하세요 : (2~9)");
		int dan = scan.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d \n", dan, i, dan * i);
		}

	}

}
