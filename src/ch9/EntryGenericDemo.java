package ch9;

public class EntryGenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entry<String, Integer> e1 = new Entry<>("홍길동", 30);
	}

}

class Entry<K, V> {
	private K key;
	private V value;

	public Entry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public final K getKey() {
		return key;
	}

	public final void setKey(K key) {
		this.key = key;
	}

	public final V getValue() {
		return value;
	}

	public final void setValue(V value) {
		this.value = value;
	}

}