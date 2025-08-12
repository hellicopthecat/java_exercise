package ch10;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewObject<String> s = x -> new String(x);
		s = String::new;

		NewArray<Integer> a = i -> new Integer[i];

		Integer[] arr = a.getArray(3);
	}

}

interface NewObject<T> {
	T getObject(T o);
}

interface NewArray<T> {
	T[] getArray(int size);
}

class Box {
	String color;

	public Box(String color) {
		super();
		this.color = color;
	}

}