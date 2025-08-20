package ch13;

public class InterruptDemo {

	public static void main(String[] args) {
		Runnable task = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("뭐하는 거냐 아들아");
				try {
//					System.out.println("왕위를 계승중입니다 아버지..");
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread thread = new Thread(task);
		thread.setPriority(Thread.MAX_PRIORITY);

		for (int i = 0; i < 5; i++) {
			System.out.println("Rok tar O'gar");
			try {
//				System.out.println("힘과 명예를 위해!!");
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
