package ch3;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		switchDate(n);
	}

	private static void switchDate(int n) {
		switch (n) {
		case 3:
			System.out.println("***");
			break;
		case 2:
			System.out.println("**");
			break;
		case 1:
			System.out.println("*");
			break;
		default:
			System.out.println("?");
		}
	}

}
