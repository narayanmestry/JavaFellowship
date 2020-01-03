package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility.DequeueLogic;

public class PalindromeCheckUsingDequeueApp {

	public static void main(String[] args) throws InterruptedException {

		DequeueLogic<Character> dl = new DequeueLogic<Character>();

		String str = "trgrt";
		System.out.println("First String  : " + str);
		char s[] = str.toLowerCase().toCharArray();
		for (char c : s) {
			dl.addRear(c); // Add the Each Character of String into Dequeue by coverting into character
		}

		Thread.sleep(300);
		dl.show();

		boolean result = dl.palindromchecker(); // if String palindrom it return true.
		System.out.println(" Result is : " + result);

		if (result) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("String is not palindrom");
		}

	}

}
