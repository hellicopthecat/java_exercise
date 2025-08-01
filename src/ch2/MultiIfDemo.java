package ch2;

import java.util.Scanner;

public class MultiIfDemo {

	public static void main(String[] args) {
		// scanner 사용
		Scanner in = new Scanner(System.in);
		// 점수입력 출력문을 실행
		System.out.println("점수를 입력하세요 : (1~100)");
		// 점수입력
		int score = in.nextInt();
		String grade = "";
		// 다중 if 문으로 입력으로 학점 계산
		if (score >= 90) {
			// A
			grade = "A";
		} else if (score < 90 && score >= 80) {
			// B
			grade = "B";
		} else if (score < 80 && score >= 70) {
			// C
			grade = "C";
		} else {
			// F
			grade = "F";
		}
		// 학점출력
		System.out.printf("Grade " + grade);
	}

}
