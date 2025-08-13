package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		Collection<String> list = new ArrayList<>(Arrays.asList("다람쥐", "개구리", "나비"));
		list.add("라마");
		list.add("나비");

		System.out.println(list.size());

		list.remove("나비");
		Iterator<String> a = list.iterator();
		while (a.hasNext()) {
			System.out.println(a.next());
		}

	}

}
