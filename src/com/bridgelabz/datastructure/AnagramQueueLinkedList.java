package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.Utility.QueueLinkedList;

public class AnagramQueueLinkedList {

	public static void main(String[] args) {
		QueueLinkedList<Integer> ql = new QueueLinkedList<Integer>();
		int i, j, k = 0, limit = 1000, count = 0;
		int prime[] = new int[limit / 2];
		System.out.println("Prime Number :");
		for (i = 1; i <= limit; i++) {
			count = 0;
			for (j = 1; j <= i; j++) {
				if ((i % j) == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.print(" " + i);
				prime[k] = i;
				k++;
			}

		}
		System.out.println("\n__________________________________________________________");

		System.out.println("\nPrime and Anagram in Array Using Queue With :LinkedList:");

		for (i = 0; i < k; i++) {
			// System.out.print(" "+prime[i]);

			if (Utility.isAnagramPrime(prime[i], prime)) {

				// System.out.println(" "+prime[i]);
				// add to the Queue ;
				ql.addToRear(prime[i]);

			}

		}

		System.out.println("\nPrime And Anagram in Queue ::");
		ql.show();

	}

}
