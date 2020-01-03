package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class AnagramApp {

	public static void main(String[] args) {
		String str1 = "heart";
		String str2 = "earth";
		boolean result = Utility.anagramChecker(str1, str2);
		if (result) {
			System.out.println("Strings are anagram ........");
		} else {
			System.out.println("Strings are not anagram ........");
		}

	}

}
