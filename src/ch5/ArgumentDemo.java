package ch5;

public class ArgumentDemo {

	public static void main(String[] args) {
		int count = Integer.parseInt(args[1]);
		nPrint(args[0], count);
	}

	public static void nPrint(String msg, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(msg);
		}
	}
}
