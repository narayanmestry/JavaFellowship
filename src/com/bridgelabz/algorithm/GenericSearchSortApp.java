package com.bridgelabz.algorithm;

import java.util.ArrayList;
import java.util.Collections;

import com.bridgelabz.utility.Utility;

public class GenericSearchSortApp {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		char c;
		int ch,i;
		String data ;
		do {
			System.out.println("Enter the Choice");
			System.out.println("1. Enter the Data :");
			System.out.println("2. Display the Data :");
			System.out.println("3. Search the Data :");
			System.out.println("4. Sort the Data :");
			ch = Utility.inputNumber();
			switch(ch)
			{
			case 1 : System.out.println("Enter the Data :");
					 data = Utility.inputString();
					 al.add(data);
					 break;
			
			case 2 : System.out.println("Data is : "+al);
				     break ;
			
			case 3 : System.out.println("Enter the data To search :");
					 data = Utility.inputString();
					 int flag =0;
					 for(i=0;i<al.size(););
					 {
						if(al.get(i)==data)
						 {
							flag =1;
						 }
						i++;
					 }
					 if(flag == 1)
					 {
						 System.out.println("DAta is Found");
					 }
					 else
					 {
						 System.out.println("DAta is not Found");
						 
					 }
					 break;
					 
			case 4 :
					Collections.sort(al);
					break;
			default :
				System.out.println("Enter the valid choice : ");
			}
			System.out.println("Do you want to continue......Press Y and y");
			c = Utility.inputChar();
		}while(c=='Y'||c=='y');
		

	}

}
