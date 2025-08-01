package ch5.sec06;

public class String5Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String version = String.format("%s %d", "JDK", 14);
		System.out.println(version);

		String pets = String.join(", ", "cat", "dog", "birds");
		System.out.println(pets);

	}

}
