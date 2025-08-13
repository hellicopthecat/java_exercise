package ch11;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> aList = new ArrayList<>();
		LinkedList<Integer> lList = new LinkedList<>();

		long start = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			aList.add(0, i);
		}
		long end = System.nanoTime();
		System.out.println(end - start);

		start = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			lList.addFirst(i);
		}
		end = System.nanoTime();
		System.out.println(end - start);

	}

}
