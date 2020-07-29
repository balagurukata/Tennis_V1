package com.bnpp.kata;

import java.util.Scanner;

import com.bnpp.kata.tennis.TennisGame;

public class TennisGameRunner {

	public String playGame() {
		String gameScore;
		Scanner inputScanner = new Scanner(System.in);

		String playerOneName = inputScanner.nextLine();

		String playerTwoName = inputScanner.nextLine();

		TennisGame tennisGame = new TennisGame(playerOneName, playerTwoName);

		do {
			char winningIndicator = inputScanner.next().charAt(0);

			tennisGame.addServicePointToWinner(String.valueOf(winningIndicator));
			gameScore = tennisGame.calculateGameScore();

		} while (isGameInProgress(gameScore));

		inputScanner.close();

		return gameScore;
	}

	private boolean isGameInProgress(String gameScore) {
		return gameScore.indexOf("won the game") == -1;
	}
}