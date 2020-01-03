/*************************************************************************************************
 	Program Name :  Ordered List : By Using  (Linkedlist Without Collection with File Handling Mechanism).
 	
 				  Desc -> Read .a List of Numbers from a file and arrange it ascending Order in a Linked List. Take user input for a number, if found then pop the number out of the list else insert the number in appropriate position
			  	  I/P -> Read from file the list of Numbers and take user input for a new number
				  Logic -> Create a Ordered Linked List having Numbers in ascending order. 
				  O/P -> The List of Numbers to a File.

 
    @author Name : Narayan Laxman Mestry.
 		
 		    Date : 11-12-2019 
 
 
 *****************************************************************************************************/
package com.bridgelabz.datastructure;

import java.io.IOException;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.Utility.OrderLinkedList;

public class OrderListApp {
	public static void main(String[] args) throws InterruptedException {
		OrderLinkedList<Integer> ol = new OrderLinkedList<Integer>();
		String filepath = "/home/admin2/Narayan Mestry/number.txt";
		String lldata[] = null;
		try {
			// Get Data From File ..
			String[] data = (String[]) Utility.getDataFromFile(filepath);
			Integer[] dt = Utility.convertToInteger(data);
			// Add to the Oredered Linked List 
			for(Integer s : dt)
			{
				ol.insert(s);
			}
			
			ol.view();
			System.out.println("Enter the new Number :");
			int input = Utility.inputNumber();
			
			ol.search(input);
			
			ol.view();
			lldata = ol.collectFromLinkedList();
			//Utility.writeToFile(filepath);
		
		
		
		
		
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}