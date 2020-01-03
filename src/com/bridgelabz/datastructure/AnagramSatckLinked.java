package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.Utility.StackLinkedList;

public class AnagramSatckLinked {

	public static void main(String[] args) {
		StackLinkedList<Integer> sl = new StackLinkedList<Integer>();
		int i, j, k = 0, limit = 1000, count = 0;
		int prime[] = new int[limit / 2];
		// for loop for calculating the Prime : 1 - 1000
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

		System.out.println("\nPrime and Anagramin Array :");
		for (i = 0; i < k; i++) {
			if (Utility.isAnagramPrime(prime[i], prime)) {
				 System.out.println(" "+prime[i]);
				// push on stack
				sl.push(prime[i]);
			}

		}

		System.out.println("\nWithout Reverse :");
		sl.show();
		///////////////////////////////

		System.out.println("\n\nAfter Reversing Array :");
		sl.showReverse();

	}

}
