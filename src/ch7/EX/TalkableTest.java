package ch7.EX;

public class TalkableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		speak(new Korean());
		speak(new American());
	}

	public static void speak(Talkable t) {
		t.talk();
	}

}

interface Talkable {
	void talk();
}

class Korean implements Talkable {

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
	}
}

class American implements Talkable {

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
}