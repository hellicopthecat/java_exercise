package ch5;

public class IncrementDemo {
	public static void main(String[] args) {
		int[] x = { 0 };
		System.out.println("함수 호출 전 x[0] : " + x[0]);
		increment(x);
		System.out.println("함수 호출 후 x[0] : " + x[0]);

	}

	public static void increment(int[] n) {
		System.out.println("increment x[0] 시작 : " + n[0]);
		n[0]++;
		System.out.println("increment x[0] 종료 : " + n[0]);

	}
}
