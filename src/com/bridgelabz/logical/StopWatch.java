package com.bridgelabz.logical;

import com.bridgelabz.utility.Utility;

public class StopWatch { 
	public static void main(String[] args) {
		int choice ;
		long start = 0,end = 0;
		int s = 0;
		System.out.println("Enter the Choice : ");
		System.out.println("1. Start the StopWatch  : ");
		System.out.println("2. Stop the StopWatch : ");
		do
		{
			choice = Utility.inputNumber();
			if(choice == 1 && s==0 )
			{
				choice = 1;
			}
			else if(choice==2 && s==0)
			{
				System.out.println("Press 1 to start first : ");
				continue;
			}
			else if(choice !=2)
			{
				System.out.println("Stopwatch is Already start please press 2 for exit");
				continue;
			}
			switch(choice)
			{
			case 1 : start = System.currentTimeMillis() ;
					System.out.println("Stopwatch is Start .......press 2 for Stop");
					s =1;
					break;
			case 2 : end = System.currentTimeMillis() ;
					s = 0;
				//  System.out.println("Press Any key for Calculate Time:");
					break;
			default : 
					System.out.println("Enter the Valid Choice");
					break;
			}
		}while(s == 1&&choice<=2);
		
	
			System.out.println("time that elapses between the start and end clicks : "+(end-start)+" miliseconds");
		
	}
} 


