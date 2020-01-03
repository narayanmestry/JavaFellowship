/*
 	@ Program name :  2D Array
 	@ Author Name : Narayan Laxman Mestry.
    @ date : 3/12/2019.
*/
package com.bridgelabz.functional;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDayMatrix {
	public static void main(String[] args) {
		PrintWriter writer = new PrintWriter(System.out); 
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[10][10];
		int i, j, row, col;
		System.out.println("Enter then number of Row : ");
		row = sc.nextInt();
		System.out.println("Enter then number of Column : ");
		col = sc.nextInt();
		System.out.println("Enter the "+(row*col)+"Array Element : ");
		//Read the Input Element From User in Matrix
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		// Display the matrix Using PrintWriter class
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				//(a[i][j]+"  ");
				writer.write(a[i][j]+" ");
			}
			writer.write("\n");
		}
		writer.flush();
		writer.close();
		sc.close();
	}

}
