package com.bridgelabz.logical;

import java.io.*;
import java.util.*;

import com.bridgelabz.utility.Utility;

public class TicTakToeGame {
	public static void main(String[] args) {
		int player = 0, count = 0, winner = 0, index=0, flag = 0, number,check = 1;
		int i, j, k;
		char sign;
		String name;
		char input[] = new char[9];
		Random r = new Random();
// Fill the array .............
		for (i = 0; i < 9; i++) {
			input[i] = ' ';
		}

		System.out.println("Enter the Username :");
		name = Utility.inputString();

		while (winner != 1) {
			flag = 0;
			System.out.flush();

			// display the boinputrd.......
			Utility.displayBoard(input);

			/*
			 * here check the turn ,,, X / 0 according to [even/odd] if even =======> X
			 * --->0,2,4,6,8 if odd ========> 0 --->1,3,5,7
			 */
			if (count % 2 == 0) {
				System.out.println("Computer Turn .....");
				index = 1 + r.nextInt(9);
				sign = 'x';
				player = 1;

			} else {
				sign = '0';
				player = 2;
				// Enter the move .........
				check = 1;
				while(check==1)
				{
						System.out.println("User Turn .....");
						index = Utility.inputNumber();
						// now check that it is valid index or not.......
						if (index > 1 && index < 9) {
							check = 0;	
						}
						else
						{
							System.out.println("Enter the Valid Index ......Please Enter index 1 to 9 ");
							check = 1;
						}
				}
				
			}

			
			if ((input[index - 1] == 'x') || (input[index - 1] == '0')) {
				System.out.println("Position is already occupay");
			} else {
				input[index - 1] = sign;
				count++;
			}
			
			// to check Horizontally	
			boolean horizontal= Utility.checkHorizontal(input,sign);
			
			// to check vertically
			boolean veretical= Utility.checkVertical(input,sign);

			// to check simulteniously
			boolean simultenious= Utility.checksimultenious(input,sign);

			if(horizontal||veretical||simultenious)
			{
				winner = 1;
				Utility.win(input);
				break;
			}		
		}
		
		if (winner == 1) {
			if (player == 1)
				System.out.println("Computer is win");
			else
				System.out.println(name + " is win");

		} else {
			System.out.println("Match draw");
		}
	}
}