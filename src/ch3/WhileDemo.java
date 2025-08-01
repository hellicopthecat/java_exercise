package ch3;

public class WhileDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startPoint = 0;
		int count = 4;
		while (startPoint < count) {

			System.out.println("Loop " + startPoint);
			startPoint++;
		}

		for (int i = 0; i < count; i++) {
			System.out.println("loop " + i);
		}

	}

}
