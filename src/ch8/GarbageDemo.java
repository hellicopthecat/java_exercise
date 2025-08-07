package ch8;

public class GarbageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 3; i++) {
			new Garbage(i);
			System.gc();
		}
	}

}

class Garbage {
	int no;

	public Garbage(int no) {
		super();
		this.no = no;
		System.out.println("Garbage" + this.no + " 생성");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(this.no + "은 수거됨");
	}
}