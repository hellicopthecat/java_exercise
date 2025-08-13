package ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("그랜저", "소나타", "아반떼", "제네시스", "소울");

		List<String> car1 = new ArrayList<>(list);
		car1.add("산타패");
		System.out.println(car1);

		List<String> car2 = new ArrayList<>(list);
		car2.remove("소나타");
		System.out.println(car2);

		System.out.println(car1.containsAll(car2));

		car1.removeIf((car) -> car.startsWith("소"));

		car1.add("아우디");
		car1.forEach((x) -> System.out.println(x));
	}

}
