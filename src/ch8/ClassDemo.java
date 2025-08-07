package ch8;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keyboard k = new Keyboard("Logitech", 3000);
		Class c = k.getClass();
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getTypeName());
		System.out.println(c.getPackage().getName());
	}

}
