package ch4.sec07;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Singleton {
	private static Singleton s = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return s;
	}

}