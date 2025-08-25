package dataStructure;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();

		stk.push("A");
		stk.push("B");
		stk.push("C");

		while (stk.empty()) {
			System.out.println(stk.pop());
		}
	}

}
