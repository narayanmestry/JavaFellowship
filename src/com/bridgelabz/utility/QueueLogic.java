package com.bridgelabz.utility;

public class QueueLogic {
	public QNode front, rear;
	public int size = 0;
	static int bankamount = 500;

	public QueueLogic() {
		front = null;
		rear = null;
		size = 0;
	}

	public int deposit() {

		int amount;
		System.out.println("Enter the Ammount :");
		amount = Utility.inputNumber();
		if (amount > 500) {
			bankamount = bankamount + amount;
		} else {
			System.out.println("Please Enter the Amount >= 500");
			deposit();
		}
		return bankamount;
	}

	public int widtdraw() {
		int amount;
		System.out.println("Enter the Ammount :");
		amount = Utility.inputNumber();
		if (amount < bankamount) {
			bankamount = bankamount - amount;
		} else {
			System.out.println("Please enter the amount < " + bankamount);
			widtdraw();
		}
		return amount;
	}

	public void enQueue(int no, String name) {
		QNode n = new QNode();
		n.setNo(no);
		n.setName(name);
		n.setNext(rear);

		if (front == null) {
			front = n;
			rear = n;
			n.setNext(rear);
		} else {
			rear.setNext(n);
			rear = n;
			rear.setNext(null);
		}

		size++;
		System.out.println("user " + rear.getNo() + " :" + rear.getName() + " has added.......please next!!!! ");
	}

	public void dequeue() {
		if (front == null) {
			System.out.println("Queue is Empty");
		} else {
			QNode t;
			t = front;
			System.out.println("Enter the user " + t.getNo() + " choice :");
			System.out.println("1. Deposit :");
			System.out.println("2. Widthrow : ");
			int ch = Utility.inputNumber();
			switch (ch) {
			case 1:
				deposit();
				front = front.getNext();
				System.out.println("please next!!!! ");
				size--;
				System.out.println("Amount is : " + bankamount);
				break;
			case 2:
				if (widtdraw() > 0) {
					front = front.getNext();
					size--;
					System.out.println("Amount is : " + bankamount);
					System.out.println("please next!!!! ");
				} else {
					System.out.println("Not Have enough cash..Please Deposit First....!!!!!!:");
				}
				break;
			default:
				System.out.println("Enter valid  choice :");
			}
		}

	}

	public int getSize() {
		return size;

	}

	public void show() {
		QNode t;
		t = front;
		if (front == null) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println("Next User is : " + front.getName());

			System.out.println("User List .................");

			while (t != rear) {
				System.out.println(" User " + t.getNo() + " : " + t.getName());
				t = t.getNext();
			}
			System.out.println(" User " + t.getNo() + " : " + t.getName());
		}
	}

}
