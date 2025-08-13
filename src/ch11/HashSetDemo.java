package ch11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set = Set.of("사과", "딸기", "포도", "배", "샤인머스켓", "아오리");
		Set<String> fruit = new HashSet<>(set);

		System.out.println(fruit);

		fruit.add(null);
		System.out.println(fruit);

		fruit.remove("배");
		System.out.println(fruit);

		TreeSet<String> fruit2 = new TreeSet<>(set);
		System.out.println(fruit2);
	}

}
