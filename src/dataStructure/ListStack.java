package dataStructure;

import java.util.EmptyStackException;

public class ListStack<E> {

	// field
	private Node<E> top;
	private int size;

	// constructor
	public ListStack() {
		top = null;
		size = 0;
	}

	// push()
	public void push(E item) {
		Node<E> newNode = new Node(item, null);
		newNode.next = top;
		top = newNode;

		size++;
	}

	// pop()
	public E pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		// 지워질 노드를 백업 받아놓음
		Node<E> removedNode = top;
		// 1등 객체 갱신
		top = top.next;
		// 지워지는 노드 정리
		removedNode.next = null;
		if (size == 1) {
			top = null;
		}
		size--;
		return removedNode.item;
	}

	// peek()
	public E peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.item;
	}

	// size()
	public int size() {
		return size;
	}

	// isEmpty()
	public boolean isEmpty() {
		return size == 0;
	}

	private class Node<E> {
		private E item;
		private Node<E> next;

		public Node(E item, Node<E> next) {
			this.item = item;
			this.next = next;
		}
	}
}
