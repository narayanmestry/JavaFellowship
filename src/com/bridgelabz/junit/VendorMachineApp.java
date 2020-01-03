package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

public class VendorMachineApp {

	public static void main(String[] args) {
		int money;
		int note[] = { 1000, 500, 100, 200, 50, 20, 10 };
	
		// Read the Money :
		System.out.println("Enter the Moeny :");
		money =Utility.inputNumber();

		if (money <= 10) {
			System.out.println("Please Enter the Money Greater than 10");
		} else {
			Utility.calculateChenge(money, note);
		}
	

	}

}
