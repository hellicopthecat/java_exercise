package ch11;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<>();
		s1.push("사과");
		s1.push("바나나");
		s1.push("체리");
		System.out.println(s1.search("바나나"));
		System.out.println(s1.pop());
		System.out.println(s1);
	}

}
