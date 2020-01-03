package com.bridgelabz.basiccore;

import com.bridgelabz.utility.Utility;

public class LeapYearApp {
	public static void main(String[] args) {
		int year;
		boolean leap;
		System.out.println("Enter the Year :");
		year = Utility.inputNumber();
		leap = Utility.leapOrNotleap(year);
		System.out.println(leap);
		if(leap)
		{
			System.out.println(year+" is Leap Year....");
		}
		else 
		{
			System.out.println(year+" is Not Leap Year....");		
		}
	}
}
