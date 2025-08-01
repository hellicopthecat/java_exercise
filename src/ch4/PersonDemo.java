package ch4;

public class PersonDemo {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("준혁").setAge(200).setNationality("일본").sayHello();

//		person.setAge(100);
//		person.setNationality("대한민국");
//		person.sayHello();

	}

}

class Person {
	private String name;
	private int age;
	private String nationality;

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public Person setNationality(String nationality) {
		this.nationality = nationality;
		return this;
	}

	public void sayHello() {
		System.out.printf("국적이 %s 이름은 %s입니다. 나이는 %d입니다.", nationality, name, age);

	}

}