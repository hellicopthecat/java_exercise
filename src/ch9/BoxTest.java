package ch9;

public class BoxTest {

	public static void main(String[] args) {
		Box<Integer> i = new Box<>();
		i.setWhat(Integer.valueOf(100));
		System.out.println(i.getWhat());

		Box<String> s = new Box<>();
		s.setWhat("만능이오!");
		System.out.println(s.getWhat());

	}

}

class Box<T> {
	private T what;

	public final T getWhat() {
		return what;
	}

	public final void setWhat(T what) {
		this.what = what;
	}

}