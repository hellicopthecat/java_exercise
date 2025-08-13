package ch11;

import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] animal1 = { "사슴", "호랑이", "바다표범", "곰" };
		List<String> animal2 = Arrays.asList(animal1); // add remove (x). set (o)
//		animal2.add(1, "개");
		animal2.set(0, "떼껄룩");
		System.out.println(animal2);
		System.out.println(animal2.size());

		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17); // immutable - add
																									// remove set (x)
//		numbers.set(10, 100);
		System.out.println(numbers);
		numbers.sort((x, y) -> x.compareTo(y));
		System.out.println(numbers);
	}

}
