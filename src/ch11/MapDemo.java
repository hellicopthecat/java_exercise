package ch11;

import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> fruits = Map.of("사과", 5, "바나나", 2, "포도", 10);
		System.out.println(fruits);
		System.out.println(fruits.size());
		System.out.println(fruits.keySet());
		System.out.println(fruits.values());

		System.out.println(fruits.containsKey("사과"));

		fruits.forEach((k, v) -> System.out.println(k + " : " + v));

	}

}
