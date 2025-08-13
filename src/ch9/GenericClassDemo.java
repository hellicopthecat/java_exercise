package ch9;

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cup c = new Cup();
		c.setBeverage(new Beer());
		Object a = c.getBeverage();
		Beer b = (Beer) a;

		Cup c1 = new Cup();
		c1.setBeverage(new Boricha());
		c1.setBeverage(new Beer());

	}

}

class Cup {
	private Object beverage;

	public Object getBeverage() {
		return beverage;
	}

	public void setBeverage(Object beverage) {
		this.beverage = beverage;
	}

}

class Beverage {

}

class Beer extends Beverage {
	void drink() {
		System.out.println("Drink beer");
	}

}

class Boricha extends Beverage {

}