package ch3;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j = 10, k = 20;
		System.out.println(max(i, j));
	}

	public static int max(int x, int y) {
		return (x > y) ? x : y;
	}

	public static double max(double x, double y) {
		return (x > y) ? x : y;
	}

	public static int max(int x, int y, int z) {
		return max(max(x, y), z);
	}

	public static double max(double x, double y, double z) {
		return max(max(x, y), z);
	}

	public static long max(long x, long y) {
		return max(x, y);
	}

	public static long max(long x, long y, long z) {
		return max(max(x, y), z);
	}

}
