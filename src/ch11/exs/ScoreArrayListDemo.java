package ch11.exs;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		while (true) {
			System.out.println("점수를 입력하세요 : ");
			String score = input.nextLine();
			// String이 들어오는 예외처리
			int parseScore = Integer.parseInt(score);
			int resultScore = parseScore > 100 ? 100 : parseScore;
			if (resultScore < 0) {
				System.out.println("전체 학생은 " + scores.size() + "명이다.");
				System.out.println("학생들의 성적 : " + scores);

				for (int i = 0; i < scores.size(); i++) {
					if (scores.get(i) > 90) {
						System.out.println(i + "번 학생의 성적은 " + scores.get(i) + "이며 " + "등급은 A이다");
					} else if (scores.get(i) < 90 && scores.get(i) > 80) {
						System.out.println(i + "번 학생의 성적은 " + scores.get(i) + "이며 " + "등급은 B이다");
					} else {
						System.out.println(i + "번 학생의 성적은 " + scores.get(i) + "이며 " + "등급은 C이다");
					}
				}
				break;
			}
			scores.add(resultScore);
		}
	}

}
