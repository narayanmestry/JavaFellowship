package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class Calender2DArray {

	public static void main(String[] args) {
		int month, year, day = 1, index = 0;
		int i, j, row = 7, col = 7;
		String arr[][] = new String[row][col];

		// Set day Name for First row;
		arr[0][0] = "SUN";
		arr[0][1] = "MON";
		arr[0][2] = "TUES";
		arr[0][3] = "WEND";
		arr[0][4] = "THU";
		arr[0][5] = "FRI";
		arr[0][6] = "SAT";

		for (i = 1; i < row; i++) {
			for (j = 0; j < col; j++) {

				arr[i][j] = " ";
			}
		}

		System.out.println("Enter the Month :");
		month = Utility.inputNumber();
		System.out.println("Enter the Year :");
		year = Utility.inputNumber();

		// We get the Day no
		int dayNo = Utility.getDayNumber(day, month, year);
		System.out.println("Day number is : " + dayNo);

		// Now we get all Data of month , like its leaf , nonleaf year and get
		// Corresponding month
		String monthToPrint[] = Utility.getMonthData(month, year);

		// here we get the data of corresponding month;
		for (i = 0; i < monthToPrint.length; i++) {
			System.out.print(" " + monthToPrint[i]);
		}

		System.out.println("\n\n");

		// put the Corresponding month data to 2D marix
		for (i = 1; i < row; i++) {
			if (i == 1) {

				for (j = dayNo; j < col && (index < monthToPrint.length); j++) {

					arr[i][j] = monthToPrint[index];
					index++;
				}
			} else {
				for (j = 0; j < col && (index < monthToPrint.length); j++) {

					arr[i][j] = monthToPrint[index];
					index++;
				}
			}

		}

		// Print the Calender in 2D Matrix :

		System.out.println("Calender of " + month + " " + year);

		for (i = 0; i < row; i++) {
			if (i == 0) {
				for (j = 0; j < col; j++) {
					System.out.print(arr[i][j] + "\t");
				}
			} else {
				if (i == 1) {
					for (j = 0; j < col; j++) {
						if (j < dayNo) {
							System.out.print("\t");
						} else {
							System.out.print(arr[i][j] + "\t");
						}
					}
				} else {
					for (j = 0; j < col; j++) {
						System.out.print(arr[i][j] + "\t");
					}
				}

			}

			System.out.println();
		}

	}

}
