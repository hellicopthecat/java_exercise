package ch13;

import dataStructure.ArrList;

public class ArrLstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrList<Integer> arrlst = new ArrList<>();

		System.out.println(arrlst.size());
		// get
		if (!arrlst.isEmpty()) {
			System.out.println(arrlst.get(0));
		}
		System.out.println(arrlst);

		// add
		arrlst.add(10);
		arrlst.add(20);
		arrlst.add(30);
		arrlst.add(40);
		arrlst.add(50, 1);

		System.out.println("aa " + arrlst);

		// remove
		if (!arrlst.isEmpty()) {
			arrlst.remove();
		}

		System.out.println(arrlst);
	}

}
