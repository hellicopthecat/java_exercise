package ch10;

public class MethodRefDemo {

	public static void main(String[] args) {
		Pickable p;
		p = (s, i) -> s.charAt(i); // ("hello",3);

		Computable c;
		Utils utils = new Utils();
		c = utils::add;

		System.out.println(c.compute(3, 5));

	}

}

@FunctionalInterface
interface Pickable {
	char pick(String s, int i);
}

class Utils {
	int add(int a, int b) {
		return a + b;
	}
}

@FunctionalInterface
interface Computable {
	int compute(int x, int y);
}