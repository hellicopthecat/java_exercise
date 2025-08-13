package ch8.EX;

import java.text.MessageFormat;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Student("김삿갓"));
		System.out.println(new Student("홍길동"));
	}

}

class Student {
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return String.format("학생[%s]", this.name);
		return MessageFormat.format("학생[{0}]", this.name);
	}
}