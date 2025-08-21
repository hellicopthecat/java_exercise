package dataStructure;

public class SLinkedListDemo {

	public static void main(String[] args) {
		//
		SLinkedList<Integer> sList = new SLinkedList<>();

		sList.addFirst(10);
		System.out.println(sList);
		System.out.println(sList.get(0));

		sList.addLast(40);
		System.out.println(sList);

		sList.add(2, 50);
		System.out.println(sList);

	}

}
