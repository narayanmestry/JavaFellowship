package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class RegexStringReplaceDemo {

	public static void main(String[] args) {
		String msg = "Hello <<name>>, We have your full name as <<full name>> in our system.\n"
				+ "your contact number is 91-xxxxxxxxxx.\n"
				+ "Please,let us know in case of any clarification\n"
				+ "Thank you BridgeLabz XX/XX/XXXX.";
			System.out.println("Before Replcement :");
			System.out.println(msg);
			System.out.println();	
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println("Enter the First Name :");
			String name = Utility.inputString();			
			System.out.println("Enter the Full Name :");
			String fullname = Utility.inputStringWithSpace();
			fullname = fullname + Utility.inputStringWithSpace();
			
			System.out.println("Enter the Mobile number");
			String mobile = Utility.inputString();
			
			System.out.println("Enter the Date");
			String date = Utility.inputString();
			
			msg = Utility.replaceString(name,fullname,mobile,date,msg);
			System.out.println("String After the Replacing .........");
			System.out.println(msg);
	}

}
