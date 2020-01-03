package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.Week;
import com.bridgelabz.utility.Weekday;

public class CalenderAppQueueStack {
	public static void main(String[] args)  {
		Week w = new Week();
		Weekday wd;
		int date = 1, month, year, i, j,totalCell,weekNo;
		String days[] = { "SUN", "MON", "TUES", "WENS", "THUS", "FRI", "SAT" };
		
		System.out.println("Enter the Month :");			// Enter the Month
		month = Utility.inputNumber();
	
		System.out.println("Enter the Year :");				// Enter the Year
		year = Utility.inputNumber();

		System.out.println("Enter the Week no. 1 to 5 :");		// Enter the Week
		weekNo = Utility.inputNumber();

		// pass the month , year and by default date =1
		int dayNo = Utility.getDayNumber(date, month, year);
		// get Month data
		String monthData[] = Utility.reverseArray(Utility.getMonthData(month, year));   // get Monthdata in reverse order
		
		System.out.println("\n\n\t\t\t Calendar : "+month+"-"+year);
		System.out.println("\t-----------------------------------------------------");
		for (i = 0; i < days.length; i++) {
			System.out.print("\t" + days[i]);
			// Day are Addes in the Queue
		}
		System.out.println();
		System.out.println("\t-----------------------------------------------------");
		totalCell = monthData.length+dayNo;
		for(i=0;i<totalCell;i++)
		{
			if(i<monthData.length)
			{
				wd = new Weekday(" ",monthData[i]);		// Wrap the day and date in Object
				w.sl.push(wd);							// push to Stack as Object
			}
			else
			{
				wd = new Weekday(" "," ");		// Wrap space into Object as day and date
				w.sl.push(wd);
			}
		}
		
		// pop the object , open this object and display it 
		
		for(i=1;i<=5;i++)
		{
			for(j=0;j<7;j++)
			{
				wd = w.sl.pop();
				if(wd!=null&&i==weekNo)
				{
					System.out.print("\t" + wd.date);
				}
			}
			System.out.println();
		}
		
		
	}
}
