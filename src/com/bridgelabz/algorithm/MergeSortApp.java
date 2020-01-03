package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class MergeSortApp {

	public static void main(String[] args) {
		String name[] = {"google","yahoo","microsoft","wipro","infosys"};
		String[] sorts = (String[]) Utility.mergeSort(name);
		Utility.mergeSort(sorts);
		for(String sort : sorts)
		{
			System.out.print(sort+" ");
		}
	}

}
