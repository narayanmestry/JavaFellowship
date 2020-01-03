package com.bridgelabz.logical;

import com.bridgelabz.utility.Utility;

public class CouponNumberApp {

	public static void main(String[] args) {
		int N;
		System.out.println("Enter the N Coupen number :");
		N = Utility.inputNumber();
		// Calculate Distinct Random number
		int[] distinctRandom = Utility.distinctCouponGenerator(N);
		// Display the random numbert without Repeating 
		System.out.print("{ ");
		for(int i=0;i<N;i++)
		{
			System.out.print(" "+distinctRandom[i]);
		}
		System.out.println(" } ");
	}

}
