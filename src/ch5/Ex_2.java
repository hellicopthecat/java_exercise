package ch5;

public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3 };

		int a = sum(1, 2, 3, 4);
		int b = sum(1, arr);
		int c = sum(1, 2, 3, 4, 5);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static int sum(int a, int... b) {
		int result = 0;
		for (int i : b) {
			result += i;
		}
		return result;
	}
}
