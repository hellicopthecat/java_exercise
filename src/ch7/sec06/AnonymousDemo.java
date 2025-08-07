package ch7.sec06;

public class AnonymousDemo {
	Bird b = new Bird() {
		@Override
		void move() {
			System.out.println("이름없는 새가 날아간다.");
		};

	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousDemo a = new AnonymousDemo();
		a.b.move();
	}

}
