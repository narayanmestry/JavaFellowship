package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class BalanceParaCheck {

	public static void main(String[] args) {
		
		String str = "(())()";
		boolean result;
		result = Utility.paraCheckFun(str);

		if (result) {
			System.out.println("This is Balance parantheses");
		} else {
			System.out.println("This is NOt Balance parantheses");
		}
	}

}
