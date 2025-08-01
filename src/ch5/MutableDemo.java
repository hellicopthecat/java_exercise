package ch5;

public class MutableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat("나비");
		Cat c2 = new Cat("떼껄룩");
		System.out.println(c1.getName());
		System.out.println(c2.getName());

	}

}

class Cat {
	private final String name; // final을 부여해 mutable에서 immutable로 변환

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}