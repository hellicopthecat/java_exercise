package ch8;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("111111", "홍길동");
		Person p2 = new Person("111111", "손흥민");
		Person p3 = new Person("123412", "손흥민");
		if (p1.equals(p2)) {
			System.out.println("같은사람");
		} else {
			System.out.println("다른사람");
		}
		if (p2.equals(p3)) {
			System.out.println("같은사람");
		} else {
			System.out.println("다른사람");
		}
	}

}

class Person {
	String no;
	String name;

	public Person(String no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Person p) {
			return this.no == p.no && this.name == p.name;
		}
		return false;
	}
}