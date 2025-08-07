package ch7.EX;

import java.util.Arrays;

public class PersonAgeDemo {

	public static void main(String[] args) {
		Person[] persons = { new Person("박지성", 40, 175, 68), new Person("홍길동", 32, 170, 75),
				new Person("손흥민", 20, 180, 70), new Person("도라에몽", 999, 160, 100) };
		Arrays.sort(persons);
		for (Person person : persons) {
			System.out.println(person.toString());
		}

	}

}

class Person implements Comparable<Person> {
	String name;
	int age;
	int height;
	int weight;

	public Person(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return o.age - this.age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("이름=%s, 나이=%d, 키=%d, 몸무게=%d", this.name, this.age, this.height, this.weight);
	}

}