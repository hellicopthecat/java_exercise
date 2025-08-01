package ch4;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		animal.eat();
		animal.move();
		Tiger tiger = new Tiger();
		tiger.move();

	}

}

class Animal {
	// 주둥이
	String mouth;

	// eat()
	void eat() {
		System.out.println("먹습니다.");
	}

	// move()
	void move() {
		System.out.println("움직입니다.");
	}
}

class Tiger extends Animal {
	// 주둥이
	// eat()
	// move()

	@Override
	void move() {
		System.out.println("호랑이는 날렵하게 움직입니다.");
	}

//	void run() {
//		System.out.println("달립니다.");
//	}
}

class Fish extends Animal {
	// 주둥이
	// eat()

	@Override
	void move() {
		System.out.println("물고기는 헤엄쳐 움직입니다.");
	}

	// move()
//	void swim() {
//		System.out.println("헤엄칩니다.");
//	}
}

class Bird extends Animal {
	// 주둥이
	// eat()
	// move()
//	void fly() {
//		System.out.println("날아갑니다.");
//	}
}