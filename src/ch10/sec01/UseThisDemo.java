package ch10.sec01;

public class UseThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseThisDemo use = new UseThisDemo();
		use.lambda();

	}

	public void lambda() {
		String hi = "Hi";
		UseThis u = new UseThis() {
			@Override
			public void use() {
				// TODO Auto-generated method stub
				System.out.println(this);
			}

		};

		u.use();

		UseThis u2 = () -> System.out.println(this);
		u2.use();

	}

}

interface UseThis {
	void use();
}