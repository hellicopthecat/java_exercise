package ch8;

import java.util.Objects;

public class ObjectMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse m1 = new Mouse("Logitech", 30000);
		Mouse m2 = new Mouse("Logitech", 30000);
		Mouse m3 = m1;
//
//		Keyboard k1 = new Keyboard("Microsoft");
//		Keyboard k2 = new Keyboard("Microsoft");

		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
	}

}

class Mouse {
	String name;
	int price;

	public Mouse(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) {
			return true;
		}
		if (obj instanceof Mouse m) {
			return this.hashCode() == m.hashCode();
		}

		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.name, this.price);
	}

}

class Keyboard {
	String name;
	int price;

	public Keyboard(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) {
			return true;
		}
		if (obj instanceof Mouse m) {
			return this.hashCode() == m.hashCode();
		}

		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.name, this.price);
	}

}