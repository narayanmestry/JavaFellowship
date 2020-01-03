package com.bridgelabz.utility;

public class QueueLinkedList<E> {
	private int size;
	private Node<E> front, rear;

	public QueueLinkedList() {
		size = 0;
		front = rear = null;
	}

	public int getSize() {
		return size;
	}

	public void addToRear(E data) {
		Node<E> n = new Node<E>();
		n.setdata(data);
		n.setNext(rear);

		if (front == null) {
			front = n;
			rear = n;
			rear.setNext(null);
		} else {
			rear.setNext(n);
			rear = n;
		}
		size++;
	}

	public void show() {
		Node<E> t;
		t = front;
		while (t != rear) {
			System.out.print(t.getdata() + "--->");
			t = t.getNext();
		}
	}

}