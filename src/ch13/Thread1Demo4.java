package ch13;

public class Thread1Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				System.out.println(Thread.currentThread().getName());
				System.out.println("조선에 당도한것을 환영하요 낯선이여");
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				System.out.println(Thread.currentThread().getName());
				System.out.println("떼껄룩");
			}
		}.start();

		System.out.println("Main");
		System.out.println(Thread.currentThread().getName());

	}

}
