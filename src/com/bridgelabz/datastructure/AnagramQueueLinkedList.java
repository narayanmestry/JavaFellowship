package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.QueueLinkedList;

public class AnagramQueueLinkedList {

	public static void main(String[] args) {
		QueueLinkedList<Integer> ql = new QueueLinkedList<Integer>();
		int i, k = 0, limit = 1000,rev = 0;
		int prime[] = Utility.getPrimeData(limit);
		System.out.println("Prime Number :");
		for (i = 0; i < prime.length; i++) {
			if (Utility.isAnagramPrime(prime[i], prime)) { // add to the Queue ;
				ql.addToRear(prime[i]);
			      rev = Utility.reverseNo(prime[i]);
				// System.out.println(prime[i]+"::"+rev);
				ql.addToRear(rev);

			}

		}

		System.out.println("\n__________________________________________________________");
		System.out.println("\nPrime and Anagram in Array Using Queue With :LinkedList:");

		System.out.println("\nPrime And Anagram in Queue ::");
		ql.show();

	}

}
