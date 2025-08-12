package ch10;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction mf = (a, b) -> a > b ? a : b;
		System.out.println(mf.max(1, 2));
		YourFn yourFn = (a, b) -> a < b ? b : a;
		System.out.println(yourFn.min(5, 10));
	}
}

@FunctionalInterface
interface MyFunction {
	int max(int a, int b);
}

@FunctionalInterface
interface YourFn {
	int min(int a, int b);
}