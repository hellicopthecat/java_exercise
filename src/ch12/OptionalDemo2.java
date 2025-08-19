package ch12;

import java.util.Optional;

public class OptionalDemo2 {

	public static void main(String[] args) {
		String s = "Hello";
		Optional<String> o = Optional.of(s);
		o.orElse("값이 없음");
		o.ifPresentOrElse(v -> System.out.println(v), () -> System.out.println(""));
	}

}
