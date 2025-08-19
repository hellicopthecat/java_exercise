package ch12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo3 {

	public static void main(String[] args) {
		//
		List<String> list1 = List.of("안녕, 자바!", "잘 가, C++!");
		Stream<String> s1 = list1.stream();
//		Arrays.stream("안녕, 자바!".split(" "));
		s1.flatMap(s -> Arrays.stream(s.split(" "))).forEach(Util::printWithParenthesis);
	}

}
