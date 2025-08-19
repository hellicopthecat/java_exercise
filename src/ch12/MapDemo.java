package ch12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("a1", "b1", "c1", "c2", "c3");
//		Stream<String> map = s1.map(s -> s.toUpperCase());
		Stream<String> map = s1.map(s -> s.substring(1));
		IntStream mapToInt = map.mapToInt(i -> Integer.parseInt(i));
		mapToInt.forEach(Util::print);

		Stream<Integer> intOf = Stream.of(1, 2, 2, 3, 4, 4, 5, 6, 7, 8);
		Stream<Integer> map2 = intOf.map(i -> i * 2);
		map2.forEach(Util::print);

	}

}
