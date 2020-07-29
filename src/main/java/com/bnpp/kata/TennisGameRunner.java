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
		LOGGER.info(WELCOME_GAME_MESSAGE);

		String gameScore = "";
		Scanner inputScanner = new Scanner(System.in);

		LOGGER.info(ENTER_PLAYER1_NAME_MESSAGE);
		String playerOneName = inputScanner.nextLine();

		LOGGER.info(ENTER_PLAYER2_NAME_MESSAGE);

		String playerTwoName = inputScanner.nextLine();

		TennisGame tennisGame = new TennisGame(playerOneName, playerTwoName);

		String winningIndicatorMessage = String.format(ENTER_PLAYER_INDICATE_MESSAGE, playerOneName, playerTwoName);

		do {
			LOGGER.info(winningIndicatorMessage);

			try {
				char winningIndicator = inputScanner.next().charAt(0);

				tennisGame.addServicePointToWinner(String.valueOf(winningIndicator));
				gameScore = tennisGame.calculateGameScore();
				
			} catch (InvalidUserInputException e) {
				LOGGER.warning(e.getMessage());
			}

			String scoreDetails = String.format(CURRENT_GAME_SCORE, gameScore);

			LOGGER.info(scoreDetails);

		} while (isGameInProgress(gameScore));

		inputScanner.close();

		LOGGER.info(GAME_OVER_MESSAGE);
		return gameScore;
	}

	private boolean isGameInProgress(String gameScore) {
		return gameScore.indexOf(WON_THE_GAME_RESULT) == GAME_SCORE_COMP_NEGATIVE_INDEX;
	}
}