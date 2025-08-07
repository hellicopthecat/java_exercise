package ch8;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String s = "hi";
		String ss = "hello";

//		s = s + "!";

		System.out.println(s.hashCode());
		System.out.println(ss.hashCode());

		String s1 = new String("hello");
		String s2 = new String("hello");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		s1 = "hohohohoho";
		System.out.println(s1.toString());

		StringBuilder sb = new StringBuilder("hello, world");
		System.out.println(sb.hashCode());
		sb.append("!");
		System.out.println(sb.hashCode());
		sb.replace(7, 12, "java");
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
	}

}
