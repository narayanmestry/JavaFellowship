package com.bridgelabz.utility;
public class DequeueLogic<E> {
	public static int size = 0;
	public Node<E> front, rear;

	public void show() throws InterruptedException {
		Node<E> t;
		t = front;
		while (t.getNext() != null) {
			Thread.sleep(600);
			System.out.print(" " + t.getdata());
			t = t.getNext();
		}
		Thread.sleep(600);
		System.out.println(" " + t.getdata());

	}

	public void addRear(E c) {
		Node<E> n = new Node<E>();
		n.setdata(c);
		n.setNext(null);
		if (front == null) {
			front = n;
			rear = n;
			rear.setNext(null);
		} else {
			rear.setNext(n);
			rear = n;
			rear.setNext(null);
		}
		size++;

	}

	public boolean palindromchecker() {
		Node<E> t1, t2;
		t1 = front;
		t2 = front;
		int i, j, k, flag = 0;

		// Iterate i and j for moving t1 forword and t2 backword
		for (i = 1, j = size; i < j; i++, j--) {
			for (k = 1; k < j; k++) {
				t2 = t2.getNext();
			}

			// After reaching t2 at j'th POsition it conpeare t1 and t2 data ,
			// its like , it compare frist and last character if same the flag set 1
			// otherwise it break , means String is nOt Palindrom.

			if (t1.getdata() == t2.getdata()) {
				flag = 1;
			} else {
				flag = 0;
				break;
			}
			t1 = t1.getNext();
			t2 = front;
		}

		System.out.println("flag == :" + flag);

		if (flag == 1) {
			return true;
		} else {
			return false;
		}

	}

}