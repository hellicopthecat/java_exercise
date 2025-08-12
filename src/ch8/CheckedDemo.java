package ch8;

public class CheckedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
