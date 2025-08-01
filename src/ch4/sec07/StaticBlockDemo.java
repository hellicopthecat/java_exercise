package ch4.sec07;

public class StaticBlockDemo {
	static int sumOneToTen;
	static {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		sumOneToTen = sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOneToTen);
	}

}

//class 