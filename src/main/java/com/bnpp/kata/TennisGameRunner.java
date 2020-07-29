package com.bnpp.kata;

import java.util.Scanner;
import java.util.logging.Logger;

import com.bnpp.kata.tennis.TennisGame;
import com.bnpp.kata.tennis.exception.InvalidUserInputException;

import static com.bnpp.kata.tennis.utils.TennisGameConstants.*;

public class TennisGameRunner {

	private static final Logger LOGGER = Logger.getLogger(TennisGameRunner.class.getName());
	
	public static void main(String[] args) {
		new TennisGameRunner().playGame();
	}
	
	public String playGame() {
		LOGGER.info("******** Welcome to play the Tennis Game! ********");
		
		String gameScore = "";
		Scanner inputScanner = new Scanner(System.in);
		
		LOGGER.info("Please enter the player1 name");
		String playerOneName = inputScanner.nextLine();

		LOGGER.info("Please enter the player2 name");
		
		String playerTwoName = inputScanner.nextLine();

		TennisGame tennisGame = new TennisGame(playerOneName, playerTwoName);
		
		String winningIndicatorMessage = String.format(
				"Press 'A' to indicate '%s' win the current service or Press 'B' to indicate ' %s' win the current service",
				playerOneName, playerTwoName);

		LOGGER.info("******** Lets start the game ! ********");
		
		do {
			LOGGER.info(winningIndicatorMessage);
			
			try {
				char winningIndicator = inputScanner.next().charAt(0);

				tennisGame.addServicePointToWinner(String.valueOf(winningIndicator));
				gameScore = tennisGame.calculateGameScore();
			} catch (InvalidUserInputException e) {
				LOGGER.warning(e.getMessage());
			}

			String scoreDetails = String.format("Current Game score: %s", gameScore);

			LOGGER.info(scoreDetails);
			
		} while (isGameInProgress(gameScore));

		inputScanner.close();
		
		LOGGER.info("******** Game Over ! ********");
		return gameScore;
	}

	private boolean isGameInProgress(String gameScore) {
		return gameScore.indexOf(WON_THE_GAME_RESULT) == GAME_SCORE_COMP_NEGATIVE_INDEX;
	}
}