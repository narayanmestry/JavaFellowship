package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

public class TempConversionApp {

	public static void main(String[] args) {
		int choice;
		char ch;
		float c_Temp, f_Temp;
		do {
			System.out.println("Enter the choice :");
			System.out.println("1. Celsius to Fahrenheit");
			System.out.println("2. Fahrenheit to Celsius");
			choice = Utility.inputNumber();
			switch (choice) {
			case 1:
				// Case 1. for convert Celsius to Fehrenaheit;
				
				System.out.println("Enter the Temperature in Celsius : ");
				c_Temp = Utility.inputFloat();
				f_Temp = Utility.celciousToFahrenheit(c_Temp);
				System.out.println("Temperature in Fahrenheit :" + f_Temp+"F");
				break;
			case 2:
				//Case 1. for convert Fehrenaheit to Celsius 
				
				System.out.println("Enter the Temperature in Fehrenheit :");
				f_Temp = Utility.inputFloat();
				c_Temp = Utility.fahrenheitToCelcious(f_Temp);
				System.out.println("Temperature in Celcius : " + c_Temp + " *C");
				break;
			default:
				System.out.println("Enter the Valid Choice");
			}
			System.out.println("Do you want to comtinue.....press Y or y");
			ch = Utility.inputChar();
		} while (ch == 'y' || ch == 'Y');


	}

}
