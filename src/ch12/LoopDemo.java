package ch12;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Nation> stream = Nation.nations.stream();

		System.out.println("호야");
		Stream<Nation> peek = stream.filter(f -> f.isIsland()).peek(Util::printWithParenthesis);
		System.out.println();
		System.out.println("야호");
		peek.mapToInt(v -> v.getName().length()).forEach(Util::printWithParenthesis);
		System.out.println();

		IntStream is = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8);
		OptionalInt max = is.max();
		System.out.println(max.getAsInt());

		is = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8);
		OptionalInt min = is.min();
		System.out.println(min.getAsInt());

		is = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8);
		OptionalDouble average = is.average();
		System.out.println(average.getAsDouble());

	}

}
