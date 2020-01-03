package com.bridgelabz.logical;

import java.util.InputMismatchException;
import java.util.Random;

import com.bridgelabz.utility.Utility;

public class TicTacToeGame {
	private static void win(char input[]) 
	{
		System.out.flush(); 
		System.out.println("Final Output ..............");
		System.out.println(input[0]+" | "+input[1]+" | "+input[2]);
		System.out.println("- | - | -");
		System.out.println(input[3]+" | "+input[4]+" | "+input[5]); // display the boinputrd.......
		System.out.println("- | - | -");
		System.out.println(input[6]+" | "+input[7]+" | "+input[8]);
		System.out.println("___________________________________________________");
		
		
	}

	public static void main(String[] args) {
		int i,index = 0,winner=0,flag=0,count=0;
		char sign;
		String player = null;
		char input[]=new char[9];
		Random r = new Random();
		for(i=0;i<9;i++)
		{
			input[i]=' ';
		}
		try {
		while(winner!=1)
		{
			flag=0;
			System.out.flush();  					// cleare the screen 

			System.out.println(input[0]+" | "+input[1]+" | "+input[2]);
			System.out.println("- | - | -");
			System.out.println(input[3]+" | "+input[4]+" | "+input[5]); // display the boinputrd.......
			System.out.println("- | - | -");
			System.out.println(input[6]+" | "+input[7]+" | "+input[8]);
			
			System.out.println("*********************************************************");
		
		
			
			if(count%2==0)
			{
				
				sign = 'x';			
				player = "Computer";	
				index =  1+r.nextInt(9);
				System.out.println("index of PC"+index);
				
				
			}
			else
			{
				sign = '0';
				player = "User";
				System.out.println("Enter the Turn .....");
			
				index = Utility.inputNumber();
				
				
			}
			// now check that it is valid index or not.......
						if(index<1&&index>9)
						{
							System.out.println("Enter the Valid Index");
							
						}
						
						if((input[index-1]=='X')||(input[index-1]=='0'))
						{
							System.out.println("Position is already occupay");
						}
						else
						{
							input[index-1]=sign;
							count++;
						}
					
						
						// to check Horizontally 
						
						for(i=0;i<9;i++)
						{
							if(i%3==0)				
							{
								flag=0;
							}
							if(input[i]==sign)
							{
								flag++;
							}
							if(flag==3)
							{
								winner=1;
								win(input);
								break;
							}
						}
						
						
						// to check simulteniously
						if((input[0]==sign&&input[4]==sign&&input[8]==sign)||(input[2]==sign&&input[4]==sign&&input[6]==sign))
						{
							winner=1;
							win(input);
							break;
						}
			
		}
		}
		catch(InputMismatchException e)
		{	
			System.out.println("Start again ANd Enter only Digit");
			
		}
		if(winner==1)
		{
			System.out.println(player+" is win");
		}
		else
		{
			System.out.println("Match draw");
		}
	}

}
