package ch3;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("값을 입력하시오 : ");
			num = in.nextInt();
		} while (num > 0);
		System.out.println("종료");

	}

}
