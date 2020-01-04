package com.bridgelabz.logical;

import java.io.*;
import java.util.*;

import com.bridgelabz.utility.Utility;

public class TicTakToeGame {
	private static void win(char input[]) {
		System.out.flush();
		System.out.println("Final Output ..............");
		System.out.println(input[0] + " | " + input[1] + " | " + input[2]);
		System.out.println("- | - | -");
		System.out.println(input[3] + " | " + input[4] + " | " + input[5]);
// display the boinputrd.......
		System.out.println("- | - | -");
		System.out.println(input[6] + " | " + input[7] + " | " + input[8]);
		System.out.println("___________________________________________________");
	}

	public static void main(String[] args) {
		int player = 0, count = 0, winner = 0, index, flag = 0, number;
		int i, j, k;
		char sign;
		String name = null;
		char input[] = new char[9];
		Random r = new Random();
		
// Fill the array .............
		for (i = 0; i < 9; i++) {
			input[i] = ' ';
		}
		while (winner != 1) {
			flag = 0;
			System.out.flush();
// cleare the screen
			System.out.println(input[0] + " | " + input[1] + " | " + input[2]);
			System.out.println("- | - | -");
			System.out.println(input[3] + " | " + input[4] + " | " + input[5]);
// display the boinputrd.......
			System.out.println("- | - | -");
			System.out.println(input[6] + " | " + input[7] + " | " + input[8]);
			System.out.println(
					"*********************************************************");/*
																					 * here check the turn ,,, X / 0
																					 * according to [even/odd] if even
																					 * =======> X --->0,2,4,6,8 if odd
																					 * ========> 0 --->1,3,5,7
																					 */
			if (count % 2 == 0) {
				System.out.println("Computer Turn .....");
				index = 1 + r.nextInt(9);
				sign = 'x';
				player = 1;
				name = "computer";
			} else {
				sign = '0';
				player = 2;
// Enter the move .........
				System.out.println("User Turn .....");
				index = Utility.inputNumber();
				name = "User";
			} // now check that it is valid index or not.......
			if (index < 1 && index > 9) {
				System.out.println("Enter the Valid Index");
			}
			if ((input[index - 1] == 'x') || (input[index - 1] == '0')) {
				System.out.println("Position is already occupay");
			} else {
				input[index - 1] = sign;
				count++;
			}
// to check Horizontally
			for (i = 0; i < 9; i++) {
				if (i % 3 == 0) {
					flag = 0;
				}
				if (input[i] == sign) {
					flag++;
				}
				if (flag == 3) {
					winner = 1;
					win(input);
					break;
				}
			}
// to check vertically
			for (i = 0; i < 3; i++) {
				flag = 0;
				for (k = i; k <= i + 6; k = k + 3) {
					if (input[k] == sign) {
						flag++;
					}
					if (flag == 3) {
						winner = 1;
						win(input);
						break;
					}
				}
			}
// to check simulteniously
			if ((input[0] == sign && input[4] == sign && input[8] == sign)
					|| (input[2] == sign && input[4] == sign && input[6] == sign)) {
				winner = 1;
				win(input);
				break;
			}
		}
		if (winner == 1) {
			System.out.println(player + " is win");
		} else {
			System.out.println("Match draw");
		}
	}
}

//narayan alogortihms programs
