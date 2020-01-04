/*****************************************************************
Program name :  Flip Coin and print percentage of Heads and Tails
				I/P -> The number of times to Flip Coin. Ensure it is positive integer.
				Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
				O/P -> Percentage of Head vs Tails 
 ********************************************************************/
package com.bridgelabz.basiccore;

import java.util.InputMismatchException;

import com.bridgelabz.utility.Utility;

public class FlipCoinDemo {
	public static void main(String[] args) {
		int i,flipcount;
		float tailcount=0,headcount=0,result,tailper,headper;
		try {
			System.out.println("Enter the Flipcount");
			flipcount = Utility.inputNumber();
			for(i=1;i<=flipcount;i++)
			{
				result=(float) Math.random()*10;
				if(result<5)
				{
					tailcount++;
					System.out.println("Tail");
				}
				else
				{
					headcount++;
					System.out.println("Head");
				}		
			}
			tailper = Utility.tailperCalculator(tailcount, flipcount);
			headper = Utility.headperCalculator(headcount, flipcount);
			System.out.println("Total Flipcount : "+flipcount);
			System.out.println("Total Tailcount : "+tailcount);
			System.out.println("Total Headcount : "+headcount);
			System.out.println("Percentage of tail :"+tailper);
			System.out.println("Percentage of Head :"+headper);
			
			
		}catch(InputMismatchException e)
		{
			System.out.println("Enter Only Integer");
		}
		finally
		{
				
		}
		
	}

}
