package ch2;

public class MyMath {
	public static long add(long a, long b) {
		return a + b;
	}

	long sub(long a, long b) {
		return a - b;
	}

	long multi(long a, long b) {
		return a * b;
	}

	long div(long a, long b) {
		if (b != 0) {
			return a / b;
		} else {
			return 0;
		}
	}
}
