package com.bridgelabz.algorithm;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class FindPrimeWithLimit {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		//ArrayList<Integer> bl = new ArrayList<Integer>();
		
		int limit = 1000;
		int i;
		System.out.println("Palindrom Prime number from 0 to " + limit);
		for (i = 1; i <= limit; i++) {
			if(Utility.isPalimdrome(i))
			{
				al.add(i);
			}
		}
		System.out.println(al);
		/*
		 * for(i=0;i<al.size();i++) { for(j=0;j<al.size();j++) { int n =
		 * Utility.isParagram(al.get(i),al.get(j)); } }
		 */
		
		
	}



}
