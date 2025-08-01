package ch5.sec06;

public class String3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hi");
		String s2 = new String(" Java");

		System.out.println("문자열 길이(s1) : " + s1.length());
		System.out.println(s1.charAt(1));

		s1 = s1.concat(s2);
		System.out.println(s1.concat(s2) + " !");
		System.out.println(s1.toLowerCase() + " !");
		System.out.println(s1.substring(4, 7) + " !");

		String s3 = " ";
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank());

		String s4 = "";
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());

		String s5 = "*_*";

		System.out.println(s5.repeat(10));

		System.out.println(s2.trim().indexOf("v"));

		System.out.println(7 + 1 + "Java" + 7 + 1);
	}

}
