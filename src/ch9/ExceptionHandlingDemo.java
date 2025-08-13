package ch9;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try {

			method1();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	static void method1() throws InterruptedException {
		method2();
	}

	static void method2() throws InterruptedException {
//		throw new NullPointerException();
		Thread.sleep(100);
	}

}
