package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

public class MonthlyPaymentApp {

	public static void main(String[] args) {
		int year, principleAmount;
		float percent;
		// Read the Input as Command Line Argument
		year = Integer.parseInt(args[0]);
		principleAmount = Integer.parseInt(args[1]);
		percent = Float.parseFloat(args[2]);
		System.out.println(" Year :" + year);
		System.out.println(" Principle Loan :" + principleAmount);
		System.out.println(" Pecent :" + percent);
		
		double monthPayAmount = Utility.paymentCalculator(year, principleAmount, percent);
		System.out.println(" Monthly Payment is : " + monthPayAmount);
		
	}

}
