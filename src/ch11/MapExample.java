package ch11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // 최고점수 아이디
		int maxScore = 0; // 최고 점수
		int minScore = 0; // 최저 점수

		Collection<Integer> value = map.values();

		int max = Collections.max(value);
		maxScore = max;

		int min = Collections.min(value);
		minScore = min;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == maxScore) {
				name = entry.getKey();
			}
		}

		System.out.println(map);
		System.out.println(maxScore);
		System.out.println(minScore);
		System.out.println(name);

	}

}
