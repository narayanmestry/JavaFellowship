/*
 	@ Program Name : To the Util Class add dayOfWeek static function that takes a date as input and
 	 				 prints the day of the week that date falls on. Your program should take three
 	 				 command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 
 	 				 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, 
 					 and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
 	
 	@ Author Name : Narayan Laxman Mestry.
	
	@ date : 3/12/2019.

*/
package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

public class DayOfWeekApp {

	public static void main(String[] args) {
		int d, m, y;
		char ch;
		do {
			System.out.println("Enter the DD/MM/YYYY");
			d = Utility.inputNumber();
			m = Utility.inputNumber();
			y = Utility.inputNumber();
			System.out.println("Date is : " + d + "/" + m + "/" + y);

			int day = Utility.dayCalculator(d, m, y);

			switch (day) {
			case 0:
				System.out.println("Day is Sunday");
				break;
			case 1:
				System.out.println("Day is Monday");
				break;
			case 2:
				System.out.println("Day is Tuesday");
				break;
			case 3:
				System.out.println("Day is Wenseday");
				break;
			case 4:
				System.out.println("Day is Thursday");
				break;
			case 5:
				System.out.println("Day is Friday");
				break;
			case 6:
				System.out.println("Day is Saturday");
				break;
			}
			System.out.println("Are you want to continue ? press y or Y");
			ch = Utility.inputChar();

		} while (ch == 'Y' || ch == 'y');
	}

}
