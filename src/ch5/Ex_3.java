package ch5;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("URL를 입력하세요.");
			String url = scan.nextLine();
			if (url.equals("bye")) {
				break;
			}

			String[] arr = url.split("\\.");

			System.out.printf("%s 은 %s로 끝납니다.\n", url, arr[2]);
			System.out.printf("%s 은 %s를 포함됩니다.\n", url, arr[1]);
			System.out.printf("%s 은 %s로 시작합니다.\n", url, arr[0]);

		}
	}
}
