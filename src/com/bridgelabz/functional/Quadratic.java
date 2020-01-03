/*
@ Program Name : Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. 
				  Since the equation is x*x, hence there are 2 roots. 
				  The 2 roots of the equation can be found using a formula 
				  (Note: Take a, b and c as input values)
				
				    delta = b*b - 4*a*c
					Root 1 of x = (-b + sqrt(delta))/(2*a)
					Root 2 of x = (-b - sqrt(delta))/(2*a)

   @ Author Name : Narayan Laxman Mestry.
   @ date : 4/12/2019.

*/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		double a,b,c;
		System.out.println("Enter the Numbers Value of :");
		a = Utility.inputDouble();
		System.out.println("Enter the Numbers Value of :");
		b = Utility.inputDouble();
		System.out.println("Enter the Numbers Value of :");
		c = Utility.inputDouble();
		
		double result[] = Utility.getRoots(a,b,c);
		
		for(int i=0;i<result.length;i++)
		{
			System.out.println(" "+result[i]);
		}
		
	}

}
