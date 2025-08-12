package ch10;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaFunctionalInterface {

	public static void main(String[] args) {
//		 Runnable void  매개변수없고 반환값없고
//		 Supplier T get() 매개변수 없고 반환값 있고
//		 Consumer void accept(T t) 매개변수 있고 반환값 없고
//		Function<T, R> R apply(T t) 매개변수 있고 반환값 있고
//		Predicate<T> boolean test(T t) 조건식 표현 매개변수 하나 반환타입 boolean
		Predicate<String> check = (a) -> a.equals("c");

		Consumer<String> printHi = (a) -> System.out.println(a);

	}

}
