package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

public class SQRTApp {

	public static void main(String[] args) {
		int num ;
		System.out.println("Enter the number :");
		num = Utility.inputNumber();
		double s = Utility.sqrt(num);
		System.out.println("Squre root is : "+s);
	}

}
