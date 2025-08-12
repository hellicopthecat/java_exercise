package ch10;

import java.util.ArrayList;

public class CollectionFrameworkDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.forEach((fruit) -> System.out.println(fruit));

		list.removeIf((fruit) -> fruit.equals("apple"));
		list.forEach((fruit) -> System.out.println(fruit));

	}

}
