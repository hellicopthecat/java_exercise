package ch3;

public class IncrementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		System.out.println("Main에서 increment를 호출하기 전 : " + x);
		x = increment(x);
		System.out.println("Main에서 increment를 호출하기 후 : " + x);

	}

	public static int increment(int n) {
		System.out.println("increment를 시작할 때  : " + n);
		n++;
		System.out.println("increment를 끝날 때  : " + n);
		return n;
	}

}
