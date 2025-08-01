package ch5;

public class ImmutableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1 == str2);
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println(str3 == str4);
	}

}
