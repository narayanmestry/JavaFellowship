package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility.Paracheck;

public class BalanceParaCheck {

	public static void main(String[] args) {
		Paracheck pc = new Paracheck();
		String str = "))(";
		boolean result;
		result = pc.paraCheckFun(str);

		if (result) {
			System.out.println("This is Balance parantheses");
		} else {
			System.out.println("This is NOt Balance parantheses");
		}
	}

}
