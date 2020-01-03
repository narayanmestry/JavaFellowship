/*********************************************
@ Program Name :    Write a program WindChill.java that takes two double command-line arguments t and v 
					and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the 
					temperature t (in Fahrenheit) and the wind speed v (in miles per hour),
					the National Weather Service defines the effective temperature (the wind chill) to be:


   @ Author Name : Narayan Laxman Mestry.
   @ date : 4/12/2019.

********************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;


public class WindChillDemo {

	public static void main(String[] args) {
		double t,v,w;
		System.out.println("Enter the Temperature : ");
		t = Utility.inputDouble();
		v = Utility.inputDouble();
		// call the method and pass the value 
		w = Utility.getWindChill(t,v);
		// Dispaly the the Result : 
		
		System.out.println("Temperature :  "+t);
		System.out.println("Speed of Wind :  "+v);
		System.out.println("WindChill =====> :  "+w);
	}

}
