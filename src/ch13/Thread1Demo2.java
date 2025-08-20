package ch13;

public class Thread1Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName());
				System.out.println("안녕하시오");
			}
		});
		thread.start();
		System.out.println("Main");
		System.out.println(Thread.currentThread().getName());

	}

}
