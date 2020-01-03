package com.bridgelabz.utility;


public class QNode {
	private int no;
	private String name;
	private QNode next;

	QNode() {
		no = 0;
		name = null;
		next = null;
	}

	QNode(String name, QNode next, int no) {
		this.no = no;
		this.name = name;
		this.next = next;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public QNode getNext() {
		return next;
	}

	public void setNext(QNode next) {
		this.next = next;
	}
	/*
	 * public int getAmount() { return amount; }
	 * 
	 * public void setAmount(int amount) { this.amount = amount; }
	 */

}
