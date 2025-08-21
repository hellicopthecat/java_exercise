package dataStructure;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
//		System.out.println(list.get(0)); // IndexOutOfBoundsException
//		System.out.println(list.remove(0)); // IndexOutOfBoundsException

		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);

		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		System.out.println(list);

		System.out.println(list.get(0));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		list.addLast(400);
		System.out.println(list);
		System.out.println(list.getLast());

		list.remove(); // == removeFirst
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
	}

}
