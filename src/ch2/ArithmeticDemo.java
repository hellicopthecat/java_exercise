package ch2;

public class ArithmeticDemo {
	public static void main(String[] args) {
		long l = 100L;
		int i = 10;

		long result = l + i;
		System.out.printf("%d 와 %d 의 + 연산 결과는 %d 입니다. \n", l, i, result);

		double d = 100.0;
		int i1 = 10;

		double result1 = d + i1;
		System.out.printf("%f와 %d의 + 연산결과는 %f 입니다. \n", d, i1, result1);

		int a = 1_000_000;
		int b = 2_000_000;

//	 long res = a*b;
		long res = (long) a * b;
		System.out.printf("%d와 %d의 * 연산결과는 %d 입니다. \n", a, b, res);

		int apple = 1;
		double pieceUnit = 0.1;

		double result2 = apple - pieceUnit;

		System.out.println(result2);

		// 나누기, 나머지 연산(0,0.0 나누거나 나머지 연산 주의)
		int zero = 0;
		double zero1 = 0.0;
//	 int res3 = 5/zero;
		System.out.println(5 / zero1);
		System.out.println(5 % zero1);

		// 짝수 홀수 % 연산
		int three = 3;
		int res4 = three % 2;
		System.out.println(res4);

		int four = 4;
		int res5 = four % 2;
		System.out.println(res5);

	}

}
