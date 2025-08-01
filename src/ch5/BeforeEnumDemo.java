package ch5;

public class BeforeEnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);

		People p = new People();
		p.age = 10;
		p.gender = Gender.MALE;

	}

}

//class People {
//	// 정적 상수
//	static final int MALE = 0;
//	static final int FEMALE = 1;
//	static final int ONE = 1;
//	static final int TWO = 2;
//
//	// 인스턴스 상수
//	final int KIND = 0;
//	final int NUM = 1;
//}
class People {
	int age;
	Gender gender;
}

enum Gender {
	// Constant
	MALE("남자"), FEMALE("여자");

	// Field
	String gender;

	// Constructor
	Gender(String gen) {
		this.gender = gen;
	}

	// Method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return gender.toString();
	}
}
