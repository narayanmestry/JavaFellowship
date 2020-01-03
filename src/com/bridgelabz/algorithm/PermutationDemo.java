package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class PermutationDemo {

	public static void main(String[] args) {
		String str = "ABC";
		int len = str.length();
		System.out.println("All Permutation are : ");
		try {
			System.out.println("Permutation Using Recursion......");
			Utility.permute(str, 0, len);
			
			System.out.println("Permutation Using Iteration......");
			Utility.iteratePermutation(str, str.length());
			boolean result = Utility.isEqual();
			if (result) {
				System.out.println("Iteration and Recursion method Generate Same number of Permutation");

			} else {
				System.out.println("Iteration and Recursion method Generate Different number of Permutation");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
