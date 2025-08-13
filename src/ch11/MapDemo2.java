package ch11;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("사과", 5, "바나나", 2, "포도", 10);
		Map<String, Integer> fruits = new HashMap<>(map);

		fruits.put("딸기", 40);
		fruits.put("사과", 3);

		System.out.println(fruits);
		System.out.println(fruits.size());
		System.out.println(fruits.keySet());
		System.out.println(fruits.values());

		Set<Map.Entry<String, Integer>> fruitsEntry = fruits.entrySet();

		for (Map.Entry<String, Integer> entry : fruitsEntry) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

//		System.out.println(fruits.containsKey("사과"));

//		fruits.forEach((k, v) -> System.out.println(k + " : " + v));

		Map<String, Integer> fruitsHashTable = new Hashtable<>(map);
//		fruitsHashTable.add

	}

}
