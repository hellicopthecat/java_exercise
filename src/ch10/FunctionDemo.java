package ch10;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> f = (a) -> a + 10;
		System.out.println(f.apply(10));

		IntToDoubleFunction idf = (a) -> (double) a * 3.0;
		System.out.println(idf.applyAsDouble(10));
	}

}
