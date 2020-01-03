package com.bridgelabz.datastructure;

import java.io.IOException;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UnorderLinkedList;

public class UnOrderListApp {

	public static void main(String[] args) throws InterruptedException, IOException {
		UnorderLinkedList<String> ll = new UnorderLinkedList<String>();
		String input;
	    // Read the Data from the File to linkedlist
		    ll.fileTOLinkedList();
//		    System.out.println("Enter the Input to insert at middle :");
//			input = Utility.inputString();
//		    ll.addAtMiddle(input);
//		    ll.viewList();
		  
	    // Enter the Data to search
			System.out.println("Enter the Input to search :");
			input = Utility.inputString();
			
			
			int loc = ll.search(input);
			if (loc > 0) {
				ll.delete(loc);      // Delete the Item based on the Location
			} else {
				ll.add(input);
			}
			ll.viewList();
			String[] list = ll.collectLinkedListData();   // Collection the data from Linkedlist to Arrya
			
	    // Write the Data to file :
			ll.LinkedListToFile(list);
	   
		    
		    
	}

}
