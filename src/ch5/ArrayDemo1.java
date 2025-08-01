package ch5;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// 스캐너 객체 할당
		Scanner in = new Scanner(System.in);
		// 배열 선언 : 크기가 5이고 정수를 담고 있는 배열
		int[] scores = new int[5];
		// 표준입력장치에서 5번 점수를 입력받아 배열에 저장
		System.out.println("입력해라");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = in.nextInt();
		}
		// 배열에서 5번 점수를 꺼내서 합계를 구하고, 평균을 구하여 출력
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println(sum);
		System.out.println(sum / scores.length);

	}

}
