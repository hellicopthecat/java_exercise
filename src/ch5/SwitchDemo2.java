package ch5;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewGender gender = NewGender.MAN;
	}

}

enum NewGender {
	MAN("남성"), WOMAN("여성");

	private String s;

	NewGender(String s) {
		this.s = s;
	}

	public String toString() {
		return s;
	}
}