package ch5;

public class BallArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball[] arr = new Ball[5];
		arr[0] = new Ball("Red");
		arr[1] = new Ball("Yellow");
		for (Ball ball : arr) {
			System.out.println(ball);
		}

	}

}

class Ball {
	String color;

	public Ball(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color;
	}
}