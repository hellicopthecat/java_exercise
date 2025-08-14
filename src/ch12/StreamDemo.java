package ch12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(r.nextInt(30));
		}

		List<Integer> gt10 = new ArrayList<>();
		for (Integer number : list) {
			if (number > 10) {
				gt10.add(number);
			}
		}

		Collections.sort(gt10);
		System.out.println(gt10);

//		Stream<Integer> result = list.stream().filter(x -> x > 10).sorted();
//		list.stream().filter(x -> x > 10).sorted().forEach(x -> System.out.println(x));
//		List<Integer> result = list.stream().filter(x -> x > 10).sorted().toList();
//		System.out.println(result);
	}

}
