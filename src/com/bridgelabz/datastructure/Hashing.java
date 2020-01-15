package com.bridgelabz.datastructure;

import com.bridgelabz.utility.OrderLinkedList;
import com.bridgelabz.utility.Utility;

public class Hashing {
	
	@SuppressWarnings("rawtypes")
	static OrderLinkedList[] main = new OrderLinkedList[11];

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		int numArr[] = { 12, 33, 44, 54, 23, 65, 45, 75, 23, 65, 44 };
		int i, rem;
		// Insert Array
		for (i = 0; i < numArr.length; i++) {
			rem = numArr[i] % 11;
			if (main[rem] == null) {
				main[rem] = new OrderLinkedList<Integer>();
				main[rem].insert(numArr[i]);
			} else {
				main[rem].search(numArr[i]);
			}
		}
		
		
		// Display 
		for (i = 0; i < 11; i++) {
			System.out.println(i+" : ");
			if(main[i]!=null)
			{
				//System.out.print(i+" : ");
				main[i].view();
			}
		}
		char c;
		do {
			// Take from User
			System.out.println("Enter the Number :");
			int num = Utility.inputNumber();
				rem = num%11;
				if(main[rem]==null)
				{
					main[rem] = new OrderLinkedList<Integer>();
					main[rem].insert(num);
				}
				else
				{
					main[rem].search(num);
				}
				
				
				// Display
				for (i = 0; i < 11; i++) {
					System.out.println(i+" : ");
					if(main[i]!=null)
					{
						//System.out.print(i+" : ");
						main[i].view();
					}
				}
			System.out.println("For Continue press Y or y");
			c = Utility.inputChar();
		}while(c=='Y'||c=='y');
		
	
	}

}
