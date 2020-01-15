package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class BinarySearchTree {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter the number of test case.");
			int test = Utility.inputNumber();
			
			System.out.println("Enter the number of node.");
			int node = Utility.inputNumber();
			
			int count = 0;
			
			for (int i=1;i<=test;i++)
			{
				count = (int) Utility.findNoOfTree((int) node);
			}
			System.out.println("We have" +" "+count+ "trees using"+" "+node+"nodes");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}