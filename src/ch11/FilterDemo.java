package ch11;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import ch12.Nation;
import ch12.Util;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> of = Stream.of("a1", "b1", "c1", "c2", "c3");
		Stream<String> filterOf = of.filter(v -> v.contains("c"));
		Stream<String> skip = filterOf.skip(1);
		skip.forEach(Util::print);

		Stream.of("a1", "b1", "c1", "c2", "c3").filter(v -> v.contains("c")).skip(2).forEach(Util::print);

		IntStream intOf = IntStream.of(1, 2, 2, 3, 4, 4, 5, 6, 7);
		IntStream filterIntOf = intOf.filter(i -> i % 2 == 0);
		IntStream distinct = filterIntOf.distinct();
		distinct.forEach(Util::printWithParenthesis);

		Stream<Nation> nationStream = Nation.nations.stream();
		Stream<Nation> nationFilter = nationStream.filter(v -> v.getPopulation() >= 100.0);
		nationFilter.forEach(Util::printWithParenthesis);

	}

}
