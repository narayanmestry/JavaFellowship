package com.bridgelabz.datastructure;

import com.bridgelabz.utility.OrderLinkedList;

public class Hashing {
	
	static OrderLinkedList[] main = new OrderLinkedList[11];

	public static void main(String[] args) throws InterruptedException {
		Hashing hs = new Hashing();
		int numArr[] = { 12, 33, 44, 54, 23, 65, 45, 75, 23, 65, 44 };
		int i, rem;
		for (i = 0; i < numArr.length; i++) {
			rem = numArr[i] % 11;
			if (main[rem] == null) {
				main[rem] = new OrderLinkedList<Integer>();
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

}
