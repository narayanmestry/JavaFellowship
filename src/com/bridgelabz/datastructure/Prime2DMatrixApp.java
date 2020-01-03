package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class Prime2DMatrixApp {
	static int arr[][] = new int[10][100];
	static int col0 = 0, col1 = 0, col2 = 0, col3 = 0, col4 = 0, col5 = 0, col6 = 0, col7 = 0, col8 = 0, col9 = 0;

	public static void main(String[] args) {
		int limit = 1000;
		int i, j, count;
		System.out.println("Only Prime Number ...............:\n");
		for (i = 1; i < limit; i++) {
			count = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				Utility.make2Dmatrix(i);
			}
		}
		Utility.showPrime();

		/*******************************
		 * Below Code Write for Prime number ans also angram number
		 */
		System.out.println("\n\n\n\nOnly Prime as well as Anagram Number ...............:");

		for (i = 1; i < limit; i++) {
			count = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				int res = Utility.isAnagram(i);
				if (res > 0) {
					Utility.anagram2Dmatrix(res);
				}

			}
		}
		Utility.showPrimeAndAnagram();
	}
}

