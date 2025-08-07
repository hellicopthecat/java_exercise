package ch7.sec06;

public class HumanTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human.echo();

		Student s = new Student(20);
		s.print();
		s.eat();

		Human p = new Worker();
		p.print();
		p.eat();

	}

}

interface Human {
	void eat();

	static void echo() {
		System.out.println("야호");
	}

	default void print() {
		System.out.println("인간입니다.");
	}
}

class Worker implements Human {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("빵을 먹습니다.");
	}

}

class Student implements Human {
	int age;

	public Student(int age) {
		super();
		this.age = age;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(age + "세의 학생입니다.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("도시락을 먹습니다.");
	}
}