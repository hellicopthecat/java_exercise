package ch5;

import java.util.Scanner;

public class ArrayDemo3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("학생의 수를 입력하세요");
		int totalStudent = in.nextInt();
		int[] scores = new int[totalStudent];
		int count = 0;
		do {
			if (totalStudent < 0) {
				break;
			}
			for (int i = 0; i < totalStudent; i++) {
				System.out.println("점수를 입력하세요");
				int score = in.nextInt();
				scores[i] = score;
				count++;
			}
		} while (count > totalStudent);
		System.out.println("끝");

		int sum = 0;
		for (int j = 0; j < scores.length; j++) {
			sum += scores[j];
		}
		System.out.println(sum);
		System.out.println(sum / totalStudent);

	}
}
