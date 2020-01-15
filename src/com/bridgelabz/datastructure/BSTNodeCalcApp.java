package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class BSTNodeCalcApp {
	public static void main(String[] args) {
		System.out.println("Enter the Number of Nodes ");
		int i, n;
		long numberOfTree;
		n = Utility.inputNumber();
		int nodes[] = new int[n];
		for (i = 0; i < n; i++) {
			nodes[i] = Utility.inputNumber();
		}

		for (i = 0; i < n; i++) {
			numberOfTree = predictTreeNumbers(nodes[i]);
			System.out.println((i + 1) + " : " + numberOfTree);
		}

	}

	private static long predictTreeNumbers(int numberOfNode) {
		int i;
		long n1, n2, sum = 0;
		if (numberOfNode == 1 || numberOfNode == 0) {
			return 1;
		} 
		
		for (i = 1; i <= numberOfNode; i++) {
			
			n1 = predictTreeNumbers(i - 1);
			n2 = predictTreeNumbers(numberOfNode - i);
			sum = sum + (n1 * n2);
		}
		return sum;
	}
}
