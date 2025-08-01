package ch5;

import java.util.Arrays;

public class FindMaxMinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 1, 4, 2 };
		System.out.println(arr);

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
//		int max = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));
	}

}
