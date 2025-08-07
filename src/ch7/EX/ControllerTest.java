package ch7.EX;

public class ControllerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller[] c = { new TV(false), new Radio(true) };

		for (Controller control : c) {
			control.show();
		}
	}

}

abstract class Controller {
	boolean power;

	public Controller(boolean power) {
		super();
		this.power = power;
	}

	void show() {
		String powerCheck = power ? "켜졌습니다." : "꺼졌습니다.";
		System.out.println(getName() + "가 " + powerCheck);
	};

	abstract String getName();
}

class TV extends Controller {
	String name = "TV";

	public TV(boolean power) {
		super(power);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}

class Radio extends Controller {
	String name = "Radio";

	public Radio(boolean power) {
		super(power);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}