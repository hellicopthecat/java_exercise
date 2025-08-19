package ch12.ex;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> scores = List.of(45, 76, 38, 27, 50);
		Stream<Integer> ss = scores.stream();
		ss.map(t -> t + 10).forEach(System.out::println);
		Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max()
				.ifPresent(System.out::println);

		List<String> list = List.of("갈매기", "나비", "다람쥐", "라마");
		list.stream().filter(s -> s.length() == 2).forEach(System.out::println);

		List<String> list1 = List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
		Optional<String> first = list1.stream().sorted().findFirst();
		first.ifPresent(System.out::println);
//		System.out.println(first.get());
	}

}
