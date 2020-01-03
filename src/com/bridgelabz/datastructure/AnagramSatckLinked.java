package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.StackLinkedList;

public class AnagramSatckLinked {

	public static void main(String[] args) {
		StackLinkedList<Integer> sl = new StackLinkedList<Integer>();
		int i, j, k = 0, limit = 1000, count = 0;
		int prime[] = Utility.getPrimeData(limit);

		System.out.println("\nPrime and Anagramin Array :");
		for (i = 0; i < prime.length; i++) {
			if (Utility.isAnagramPrime(prime[i], prime)) {
				// push on stack
				sl.push(prime[i]);
			    int rev = Utility.reverseNo(prime[i]);
			    sl.push(rev);
			    //System.out.println(prime[i]+"::"+rev);
			} 

		}

		//System.out.println("\nWithout Reverse :");
	//sl.show();
		///////////////////////////////

		System.out.println("\n\nAfter Reversing Array :");
		sl.showReverse();

	}

}
