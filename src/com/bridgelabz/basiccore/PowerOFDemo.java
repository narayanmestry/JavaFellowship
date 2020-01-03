/*
 
  	@ Program Name : This program takes a command-line argument N 
	
	@ Author Name : Narayan Laxman Mestry.
	
	@ date : 2/12/2019.

 */
package com.bridgelabz.basiccore;
import com.bridgelabz.utility.Utility;
public class PowerOFDemo {
	public static void main(String[] args) {
		 int N ,i,power;
		 N = Integer.parseInt(args[0]);
		 for(i=1;i<=N;i++)
		 {
			power = Utility.calculatePower(i,N);
			System.out.println("2^"+i+" :"+power);
		 }

	}

}
