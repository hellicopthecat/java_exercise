package dataStructure;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListQueue<Integer> q = new ListQueue<>();

		q.offer(10);
		System.out.println(q.peek());
		q.offer(20);
		System.out.println(q.peek());
		q.offer(30);
		System.out.println(q.peek());

//		while (!q.isEmpty()) {
//			System.out.println(q.poll());
//		}

	}

}
