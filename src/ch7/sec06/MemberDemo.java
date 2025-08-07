package ch7.sec06;

public class MemberDemo {
	class Eagle extends Bird {
		@Override
		void move() {
			// TODO Auto-generated method stub
			System.out.println("독수리 날아간다");
		}
	}

	Eagle e = new Eagle();

	public static void main(String[] ars) {
		MemberDemo m = new MemberDemo();
		m.e.move();

	}
}
