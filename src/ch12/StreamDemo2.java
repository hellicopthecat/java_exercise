package ch12;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		int[] ia = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(ia);

		String[] sa = { "a", "b", "c", "d", "e" };
		Stream<String> sss = Arrays.stream(sa);
		Stream<String> ss = Stream.of(sa);

		double[] da = { 4.5, 6.0, 2.2, 4.0, 8.2 };
		DoubleStream ds = DoubleStream.of(da);

//		Random random = new Random();
//		IntStream ints = random.ints(0, 100);
//		ints.limit(10).forEach(x -> System.out.println(x));
//
//		IntStream iterate = IntStream.iterate(1, i -> i + 2);
//		iterate.limit(3).forEach(x -> System.out.println(x));

		IntStream range = IntStream.range(1, 10);
		range.forEach(x -> System.out.println(x));
		IntStream rangeClosed = IntStream.rangeClosed(1, 10);
		rangeClosed.forEach(x -> System.out.println("여기 " + x));
	}

}
