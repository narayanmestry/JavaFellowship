package com.bridgelabz.basiccore;
import java.util.ArrayList;
import com.bridgelabz.utility.Utility;

public class PrimeFactorApp {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the Number :");
		num = Utility.inputNumber();
		ArrayList<Integer> al = Utility.getPrimeFactor(num);
		System.out.println("Prime Factor :"+al);
	}

}
