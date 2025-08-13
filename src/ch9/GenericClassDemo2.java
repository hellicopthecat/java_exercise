package ch9;

import java.util.ArrayList;

public class GenericClassDemo2 {

	public static void main(String[] args) {
		Cups<String> c = new Cups<>();
		c.setBeverage("KAKS");
		c.getBeverage();

		Cups<Boricha> brc = new Cups<>();
		brc.setBeverage(new Boricha());
		Boricha bori = brc.getBeverage();
		System.out.println(bori);

		ArrayList<Integer> intArr = new ArrayList<>();
		intArr.add(4);
		System.out.println(intArr);
		intArr.add(0, 5);
		intArr.add(0, 3);
		intArr.add(0, 2);

		System.out.println(intArr.get(2));
	}

}

class Cups<T> {
	private T beverage;

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}

}