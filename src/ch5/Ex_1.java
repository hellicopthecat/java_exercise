package ch5;

public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = coutChar("Hellhhho", 'h');
		System.out.println(num);
	}

	public static int coutChar(String a, char c) {
		int result = 0;
		for (int i = 0; i < a.length(); i++) {
			char lowerChar = a.toLowerCase().charAt(i);
			char upperChar = a.toUpperCase().charAt(i);
			if (lowerChar == c || upperChar == c) {
				result++;
			}
		}
		return result;
	}
}
