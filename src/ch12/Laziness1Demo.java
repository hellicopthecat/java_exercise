package ch12;

import java.util.stream.IntStream;

public class Laziness1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream intClose = IntStream.rangeClosed(1, 5);
		intClose.filter(x -> x % 2 == 0) // Predicate
				.map(x -> x * x) // IntUnaryOperator
				.forEach(System.out::println);
	}

}
