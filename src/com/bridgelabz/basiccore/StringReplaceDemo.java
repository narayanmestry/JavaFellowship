/*
Program name  : User Input and Replace String Template “Hello <<UserName>>, How are you?” 
				I/P -> Take User Name as Input. Ensure UserName has min 3 char
				Logic -> Replace <<UserName>> with the proper name
				O/P -> Print the String with User Name
				

*/
package com.bridgelabz.basiccore;
import com.bridgelabz.utility.Utility;
public class StringReplaceDemo {
	public static void main(String[] args) {
		String userinput = "Hello <<user name>> ! How are you ?";
		System.out.println("Enter the Username");
		String name = Utility.inputString();				// imput the String
		String replaceString = Utility.replaceString(name, userinput);   // Pelace the String 
		System.out.println("Replace String : " + replaceString);
	}
}
