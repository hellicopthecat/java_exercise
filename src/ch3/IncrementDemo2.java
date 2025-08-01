package ch3;

public class IncrementDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 0;
//		System.out.println("Main에서 increment를 호출하기 전 : " + x);
//		x = increment(x);
//		System.out.println("Main에서 increment를 호출하기 후 : " + x);
		RefValue ref = new RefValue();
		System.out.println("Main에서 increment를 호출하기 전 : " + ref.x);
		increment(ref);
		System.out.println("Main에서 increment를 호출하기 후 : " + ref.x);
	}

	public static void increment(RefValue ref) {
		System.out.println("increment를 시작할 때  : " + ref.x);
		ref.x++;
		System.out.println("increment를 끝날 때  : " + ref.x);
	}

}

class RefValue {
	int x;
}