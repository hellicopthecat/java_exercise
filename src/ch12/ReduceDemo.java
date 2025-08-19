package ch12;

import java.util.stream.IntStream;

public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream is = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8);
		int reduce = is.reduce(0, (x, y) -> x + y);
		System.out.println(reduce);

	}

}
