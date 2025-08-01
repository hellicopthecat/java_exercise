package ch4;

public class ClassDiagramEx {
	public static void main(String[] args) {
		AnimalKind animalKind = new AnimalKind();
		animalKind.gender = "Boy";
	}
}

class AnimalKind {
	public int age;
	String gender;

	void isMammal() {
	}

	void introduce(String txt) {
	}
}

class Duck extends AnimalKind {
	String beakColor = "yellow";

	void swim() {
	}

	void quak() {
	}
}

class Fish1 extends AnimalKind {
	int sizeInFt;

	void swim() {
	}
}
