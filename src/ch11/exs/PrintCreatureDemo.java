package ch11.exs;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PrintCreatureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> set = new HashSet<>();
		Person p0 = new Person("김열공", 20);
		Person p = new Person("김열공", 20);
		Person p1 = new Person("최고봉", 20);
		Person p2 = new Person("우등생", 20);
		Person p3 = new Person("나자바", 20);
		set.add(p0);
		set.add(p);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		System.out.println(set);

	}

}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Person[%s : %d]", this.name, this.age);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj instanceof Person p) {
			return this.hashCode() == obj.hashCode();
		}
		return false;

	}
}