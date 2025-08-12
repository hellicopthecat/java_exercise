package ch9;

public class UnCheckedDemo2 {

	public static void main(String[] args) {
		//// ArithmeticException
		try {
			int res = 5 / 1;
			String str = "";
			System.out.println(str.length());
			int[] arr = new int[0];
			System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
			System.out.println("0으로 나눌수 없다");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("문자열 값이 없음");

		} catch (Exception e) {
			System.out.println("알 수 없는 예외가 발생했습니다.");
			e.printStackTrace();
		}

	}

}
