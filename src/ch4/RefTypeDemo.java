package ch4;

public class RefTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		Ball myBall = new Ball();
		Ball yourBall = new Ball();
		System.out.println(myBall);
		System.out.println(yourBall);
		System.out.println(yourBall == myBall);

		myBall = yourBall;
		System.out.println(myBall);
		System.out.println(yourBall);
		System.out.println(yourBall == myBall);
	}

}

class Ball {

}