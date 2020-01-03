package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class InsertionSortApp {

	public static void main(String[] args) {
		String a[] = {"chetan","nayan","narayan","vishu","Aaba","Gaja"}; 
		String b[] = Utility.insertionSort(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
