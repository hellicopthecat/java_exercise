package ch9;

import java.util.StringTokenizer;

public class UnCheckedDemo {

	public static void main(String[] args) {
		//// ArithmeticException
		// int res = 5 / 0;

		//// NullPointerException
		// String str = null;
		// System.out.println(str.length());
		// int[] arr = null;

		//// NoSuchElementException
		String no = "a b c";
		StringTokenizer st = new StringTokenizer(no);
		while (st.hasMoreTokens()) {
			st.nextToken();
		}
		st.nextToken();
	}

}
