package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

public class BinaryConvertorApp {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the Decimal number : ");
		num = Utility.inputNumber();
		int bin[]=Utility.toBinary(num);
		int length = bin.length;
		
		// Binary Representation ...
		for(int i =length -1 ;i>=0;i--)
		{
			System.out.print(bin[i]+" ");
		}
	}

}
