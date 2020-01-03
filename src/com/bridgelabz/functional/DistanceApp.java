/*
   @ Program Name : Write a program Distance.java that takes two integer command-line arguments x and y and prints the
				  Euclidean distance from the point (x, y)
				  to the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y).
				  Use Math.power function
				  
   @ Author Name : Narayan Laxman Mestry.
   @ date : 4/12/2019.			 
*/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class DistanceApp {

	public static void main(String[] args) {
		int x1=0,y1=0,x2=4,y2=4;
		double distance = Utility.getDistance(x1,x2,y1,y2);
		System.out.println("Distace is :"+distance);
	}

}
