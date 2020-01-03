package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class GuessNoApp {

	public static void main(String[] args) {
		int N,num=1;
		System.out.println("Enter the N :");
		N = Utility.inputNumber();
		int a[] = new int[N];
		// Take the number from 0 to N in the Array
		for (int i = 0; i < N; i++) {
			a[i] = num;
			num++;
		}
		// Display the 1 to N number
		for (int i = 0; i <= N; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Think any number between 0 to "+N);
		int number = Utility.find(a);
		System.out.println("Your number is :"+number);
	}

}
