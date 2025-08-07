package ch6;

public class MovableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable m = new Car();
		m.move(5);
	}

}

interface Movable {
	void move(int s);
}

class Car implements Movable {
	private int pos = 0;

	@Override
	public void move(int x) {
		// TODO Auto-generated method stub
		pos += x;
	}

	public void show() {
		System.out.println(pos + "만큼 이동했다우.");
	}
}