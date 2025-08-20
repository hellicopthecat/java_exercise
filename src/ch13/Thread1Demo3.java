package ch13;

public class Thread1Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new WorkerThread();
		thread.start();

		Thread thread2 = new WorkerThread();
		thread2.start();

		System.out.println("Main");
		System.out.println(Thread.currentThread().getName());

	}

}

class WorkerThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		System.out.println("안녕하시오 낯선이여");
	}
}