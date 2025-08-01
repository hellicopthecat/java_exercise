package ch5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("학생의 수를 입력하세요");
		int totalStudent = in.nextInt();
		ArrayList<Integer> scores = new ArrayList<>();
		while (true) {

			System.out.println("점수를 입력하세요");
			int score = in.nextInt();
			if (totalStudent < 0) {
				break;
			}
			scores.add(score);
		}

		System.out.println("끝");

		int sum = 0;
		for (int j = 0; j < scores.size(); j++) {
			sum += scores.get(j);
		}
		System.out.println(sum);
		System.out.println(sum / totalStudent);

	}
}
