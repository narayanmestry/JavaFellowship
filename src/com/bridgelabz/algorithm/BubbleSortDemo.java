package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class BubbleSortDemo {

	public static void main(String[] args) {
		String a[]= {"chetan","aaryan","narayan","vishu","aaba","gaja"};
		int i;	
		String b[] = Utility.bubbleSort(a);
		for(i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"   ");
		} 
	}
}