package ch5;

public class VarArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1, 3));
		System.out.println(add(1, 3, 2));
		System.out.println(add(1, 3, 2, 4));
		System.out.println(add(1, 3, 2, 4, 6));
		System.out.println(add(1, 3, 6, 8, 9, 7));
		System.out.println(add(1, 3, 1, 4, 3, 7, 9, 5));

	}

//	public static int add(int a, int b) {
//		return a + b;
//	}
//
//	public static int add(int a, int b, int c) {
//		return a + b + c;
//	}
//
//	public static int add(int a, int b, int c, int d) {
//		return a + b + c + d;
//	}
//
//	public static int add(int a, int b, int c, int d, int e) {
//		return a + b + c + d + e;
//	}

	public static int add(int... number) {
		int sum = 0;
		for (int num : number) {
			sum += num;
		}
		return sum;
	}

}
