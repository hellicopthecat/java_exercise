package ch12;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = null;
		Optional<Integer> e = Optional.empty();
		Optional<Integer> of = Optional.of(3);
		Optional<Integer> ofNullable = Optional.ofNullable(i);

		System.out.println(e.isEmpty());
		System.out.println(of.get());
		System.out.println(ofNullable.isEmpty());
		System.out.println(ofNullable.isPresent());

		i = 10;
		ofNullable = Optional.ofNullable(i);
		ofNullable.ifPresent(c -> System.out.println(c));
		System.out.println(ofNullable.isEmpty());
		System.out.println(ofNullable.isPresent());
	}

}
