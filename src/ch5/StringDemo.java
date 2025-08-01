package ch5;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "J";
		String s2 = "C";
		String s3 = new String("J");
		String s4 = "j";

		System.out.println("s1 == s3 " + (s1 == s3));
		System.out.println("s1 == s3 " + (s1.equals(s3)));
		System.out.println("s3 == s4 " + (s3.equalsIgnoreCase(s4)));
		System.out.println("s1 == s4 " + (s1 == s4));

	}

}
