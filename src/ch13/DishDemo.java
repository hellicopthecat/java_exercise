package ch13;

public class DishDemo {

	public static void main(String[] args) {
		Dish dish = new Dish();
		new Thread(new Cooker(dish)).start();
		new Thread(new Customer(dish)).start();
	}

}

class Dish {
	private boolean isEmpty = true;

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
}

class Cooker implements Runnable {
	private final Dish dish;

	public Cooker(Dish dish) {
		super();
		this.dish = dish;
	}

	private void cook(int i) throws InterruptedException {
		synchronized (dish) {
			while (!dish.isEmpty()) {
				dish.wait();
			}
			dish.setEmpty(false);
			System.out.println(i + " 번째 음식이 준비되었습니다.");
			dish.notify();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				cook(i);
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Customer implements Runnable {
	private final Dish dish;

	public Customer(Dish dish) {
		super();
		this.dish = dish;
	}

	private void eat(int i) throws InterruptedException {
		synchronized (dish) {
			while (dish.isEmpty()) {
				dish.wait();
			}
			dish.setEmpty(true);
			System.out.println(i + " 번째 음식을 먹었습니다.");
			dish.notify();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				eat(i);
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}