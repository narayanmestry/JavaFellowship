package com.bridgelabz.datastructure;

import com.bridgelabz.utility.OrderLinkedList;

public class Hashing {
	OrderLinkedList[] main = new OrderLinkedList[11];

	public Hashing() throws InterruptedException {
		int numArr[] = { 12, 33, 44, 54, 23, 65, 45, 75, 23, 65, 44 };
		int i, rem;
		for (i = 0; i < numArr.length; i++) {
			rem = numArr[i] % 11;
			if (main[rem] == null) {
				main[rem] = new OrderLinkedList();
				main[rem].insert(numArr[i]);
			} else {
				main[rem].insert(numArr[i]);
			}
		}

		for (i = 0; i < 11; i++) {
			System.out.println(i+" : ");
			if(main[i]!=null)
			{
				//System.out.print(i+" : ");
				main[i].view();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Hashing hs = new Hashing();
	}

}
