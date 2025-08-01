package ch4.sec07;

import java.util.Scanner;

public class DiceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Dice dice = new Dice();
		System.out.println("반복하고자하는 숫자를 입력하시오. : (1~*)");
		int count = scan.nextInt();
		for (int i = count; i <= count; i++)
			dice.roll();

	}

}

class Dice {
	int result;

	public int roll() {
		result = (int) (Math.random() * 6 + 1);
		System.out.println(result);
		return result;
	}

}