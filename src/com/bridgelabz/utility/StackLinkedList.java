package com.bridgelabz.utility;

public class StackLinkedList<E> {
	public static int size;
	private Node<E> top;
	private Weekday wd;

	public StackLinkedList() {
		size = 0;
		top = null;
	}

	public void push(E data) {
		// TODO Auto-generated method stub
		Node<E> n = new Node<E>();
		n.setdata(data);
		n.setNext(top);

		if (top == null) {
			top = n;
		} else {
			n.setNext(top);
			top = n;

		}
		size++;
	}

	public void show() {
		Node<E> t;
		t = top;
		while (t != null) {
			System.out.print(t.getdata() + "==>");
			t = t.getNext();
		}

	}

	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	public void showReverse() {
		Node<E> t;
		t = top;
		int i, j;
		for (i = size; i > 0; i--) {
			for (j = 1; j < i; j++) {
				t = t.getNext();
			}
			System.out.print(t.getdata() + "==>");
			t = top;
		}
	}

	public Weekday pop() {
		if (top != null) {
			wd = (Weekday) top.getdata();
			top = top.getNext();
			size--;
			return wd;
		} else {
			return null;
		}

	}
}
