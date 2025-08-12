package ch10;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntPredicate even = x -> x % 2 == 0;
		System.out.println(even.test(3) ? "짝수" : "홀수");
		System.out.println(even.test(4));

		BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
		System.out.println(bp.test(5, 10));
		System.out.println(bp.test(10, 20));

		Predicate<String> p = x -> x.equals("bye") || x.equals("");
		System.out.println(p.test(""));
		System.out.println(p.test("bye"));
	}

}
