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
			size++;
		} else {
			
			rear.setNext(n);
			rear = n;
		
			n.setNext(null);
			size++;
		}
		
	}
	

	public void show() {
		Node<E> t;
		t = front;
	
		while (t.getNext() != rear) {
			System.out.print("{ ");
			for(int i=0;i<2;i++)
			{
				System.out.print(t.getdata() + ",");
				t = t.getNext();
			}
			System.out.print(" }");
			System.out.println();
		}
	}

}