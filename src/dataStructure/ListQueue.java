package dataStructure;

public class ListQueue<E> {
	// field
	private Node<E> front;
	private Node<E> rear;
	private int size;

	// constructor
	public ListQueue() {
		front = rear = null;
		size = 0;
	}

	// offer
	public void offer(E item) {
		Node<E> newNode = new Node(item, null);
		if (isEmpty()) {
			rear = newNode;
		}
		newNode.next = front;
		front = newNode;
		size++;
	}

	// poll
	public E poll() {
		if (isEmpty()) {
			return null;
		}
		E removeTarget = rear.item;
		size--;
		return null;
	}

	// peek
	public E peek() {
		if (isEmpty()) {
			return null;
		}
		return front.item;
	}

	// size
	public int size() {
		return size;
	}

	// isEmpty
	public boolean isEmpty() {
		return size == 0;
	}

	// inner class
	private class Node<E> {
		private E item;
		private Node<E> next;

		public Node(E item, Node<E> next) {
			this.item = item;
			this.next = next;
		}
	}
}
