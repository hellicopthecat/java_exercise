package ch4;

public class PhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone myPhone = new Phone();
		myPhone.model = "Galaxy s25";
		myPhone.value = 200;
		myPhone.print();

		Phone yourPhone = new Phone();
		yourPhone.model = "iPhone 18";
		yourPhone.value = 300;
		yourPhone.print();
	}

}

class Phone {
	String model;
	int value;

	void print() {
		System.out.println(value + "만원짜리 " + model + " 스마트폰");
	}
}