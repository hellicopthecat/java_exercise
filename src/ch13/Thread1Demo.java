package ch13;

public class Thread1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new MyRunnable());
		thread.start();
		System.out.println("Main");
		System.out.println(Thread.currentThread().getName());

		Thread thread1 = new Thread(new MyRunnable());
		thread1.start();
		System.out.println("Main1");
		System.out.println(Thread.currentThread().getName());
	}

}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());
	}
}