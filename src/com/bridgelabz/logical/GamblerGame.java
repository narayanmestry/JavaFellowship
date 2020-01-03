package com.bridgelabz.logical;

import com.bridgelabz.utility.Utility;
public class GamblerGame {

	public static void main(String[] args) {
		int stake, trail, goal;
		// Read the Stake , Trial , Goal.
		System.out.println("Enter the Stake : ");
		stake = Utility.inputNumber();
		System.out.println("Enter the Trail : ");
		trail = Utility.inputNumber();
		System.out.println("Enter the GOAL : ");
		goal = Utility.inputNumber();
		// Now Play the game
		int winCount = Utility.playGame(stake,trail,goal);
		int lossCount = trail - winCount;
		// Calculate the Percentage
		int winPercentage = Utility.winPerc(winCount,trail);
		int lossPercentage = Utility.lossPerc(lossCount,trail);
		// Display the Percentage
		System.out.println("Percentage of Wins : " +winPercentage);
		System.out.println("Percentage of Loss : " +lossPercentage);

	}

}
