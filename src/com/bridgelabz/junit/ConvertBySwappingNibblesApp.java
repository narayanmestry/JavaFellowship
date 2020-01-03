package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

public class ConvertBySwappingNibblesApp {

	public static void main(String[] args) {
		int num,i,x;
		System.out.println("Enter the Decimal number : ");
		num = Utility.inputNumber();
		int bin[]=Utility.toBinary(num);
		int length = bin.length;
		int b[] = new int[length];
		
		// Binary Representation ...
		for(i =length -1,x=0 ;i>=0;i--,x++)
		{
			System.out.print(bin[i]+" ");
			b[x] = bin[i];
		}
		System.out.println("\n\n Now by Swaping nibbles ....");
		b = (int[]) Utility.swapNibblesBinary(b);
		// Print the Binary Replresentation with Swaping nibbles 
		for(i=0;i<b.length;i++)
		{
			System.out.print(" "+b[i]);
		}
		System.out.println();
		//Now Convert binary to decimal .
		int decimal = Utility.binaryTODecimal(b);
		System.out.println("Generated Number by Swapping Nibbles is : "+decimal);
	}

}
