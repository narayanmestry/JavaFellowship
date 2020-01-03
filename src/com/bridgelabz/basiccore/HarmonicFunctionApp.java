/*
	@ Program name : Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
	
	@ Author Name : Narayan Laxman Mestry.
	
	@ date : 2/12/2019.
 */
package com.bridgelabz.basiccore;
import com.bridgelabz.utility.Utility;

public class HarmonicFunctionApp {
	public static void main(String[] args) {
		float sum = 0 ;
		int limit;
		System.out.println("Enter the Limit of the Series : ");
		limit = Utility.inputNumber();
		sum=Utility.calculateHarmonic(limit);
		System.out.println("Sum is : "+sum);
	}
}
