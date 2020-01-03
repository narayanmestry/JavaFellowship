package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.Week;
import com.bridgelabz.utility.Weekday;

public class CalenderAppQueueLinkedList {

	public static void main(String[] args)  {
		Week w = new Week();
		Weekday wd;
		int date = 1, month, year, i, j;
		String days[] = { "SUN", "MON", "TUES", "WENS", "THUS", "FRI", "SAT" };
		// Enter the Month
		System.out.println("Enter the Month :");
		month = Utility.inputNumber();
		// Enter the Year
		System.out.println("Enter the Year :");
		year = Utility.inputNumber();

		// pass the month , year and by default date =1
		int dayNo = Utility.getDayNumber(date, month, year);
		// get Month data
		String monthData[] = Utility.getMonthData(month, year);
		
		System.out.println("\n\n\t\t\t Calendar : "+month+"-"+year);
		System.out.println("\t-----------------------------------------------------");
		for (i = 0; i < days.length; i++) {
			System.out.print("\t" + days[i]);
			// Day are Addes in the Queue
		}
		System.out.println();
		System.out.println("\t-----------------------------------------------------");
		
		j = 0;
		for (i = 0; i < (monthData.length + dayNo); i++)
		{
			if (i < dayNo)
			{
				wd = new Weekday(" ", " ");   //   Weeday value Store into Objct / Wrapping
				w.ql.add(wd);				  // Pass the Object into Queue 
			}
			else if(j < (monthData.length))
			{
					wd = new Weekday(" ", monthData[j]);  //   Weeday value Store into Objct / Wrapping
					w.ql.add(wd);                         // Pass the Object into Queue 
					j++;
			}

		}
	
		// Pop the object from Queue and 
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 7; j++) {
				wd = w.ql.remove();
				if(wd!=null)
				{
					System.out.print("\t" + wd.date);
				}
			}
			System.out.println();
		}
	}

}
