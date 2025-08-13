package ch11.exs;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Map<String, Integer> map = new Hashtable<>();

		map.put("김열공", 80);
		map.put("최고봉", 90);
		map.put("우등생", 95);
		map.put("나자바", 88);

		while (true) {
			System.out.println("이름을 입력하세요 : ");
			String name = in.nextLine();
			int score = map.get(name);
			System.out.println(score);
		}
	}

}
