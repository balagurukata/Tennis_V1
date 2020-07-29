package com.bnpp.kata.tennis;


import com.bnpp.kata.tennis.model.Player;
import static com.bnpp.kata.tennis.utils.TennisGameConstants.*;

public class TennisGame {

	private Player playerOne;
	private Player playerTwo;

	public TennisGame() {
		super();
		playerOne = new Player(PLAYER_ONE_NAME);
		playerTwo = new Player(PLAYER_TWO_NAME);
	}

	public int getPlayerOneScoredPoint() {
		return playerOne.getScoredPoint();
	}

	public int getPlayerTwoScoredPoint() {
		return playerTwo.getScoredPoint();
	}

	public String getPlayerOneName() {
		return playerOne.getName();
	}

	public String getPlayerTwoName() {
		return playerTwo.getName();
	}

	public String calculateGameScore() {
		String gameScore;

		if (isPlayersHasEqualScore()) {
			gameScore = isPalyersHasDeuceScore() ? DEUCE_GAME_SCORE : generateGameAllScore();
		} else if (isGameWonByAnyPlayer()) {
			gameScore = getTopScoredPlayerName() + WON_THE_GAME_RESULT;
		} else if (isPlayerOneHasAdvantage()) {
			gameScore = getTopScoredPlayerName() + HAS_ADVANTAGE_SCORE;
		} else {
			gameScore = generateGameScore();
		}
		return gameScore;
	}

	private boolean isPlayerOneHasAdvantage() {
		return playerOne.getScoredPoint() >= MINIMUM_WINNING_SCORE
				&& playerOne.getScoredPoint() - playerTwo.getScoredPoint() == ADVANTAGE_DIFFERENCE_POINT;
	}

	private boolean isPalyersHasDeuceScore() {
		return playerTwo.getScoredPoint() >= MINIMUM_DEUCE_SCORE;
	}

	private boolean isPlayersHasEqualScore() {
		return playerOne.getScoredPoint() == playerTwo.getScoredPoint();
	}

	private String getTopScoredPlayerName() {
		return playerOne.getScoredPoint() > playerTwo.getScoredPoint() ? playerOne.getName() : playerTwo.getName();
	}

	private boolean isGameWonByAnyPlayer() {
		return (playerOne.getScoredPoint() >= MINIMUM_WINNING_SCORE || playerTwo.getScoredPoint() >= MINIMUM_WINNING_SCORE) && Math
				.abs(playerTwo.getScoredPoint() - playerOne.getScoredPoint()) >= MINIMUM_WINNING_DIFFERENCE_POINT;
	}

	private String generateGameAllScore() {
		return getGameScore()[playerOne.getScoredPoint()] + GAME_SCORE_SEPARATOR + GAME_SCORE_ALL;
	}

	private String generateGameScore() {
		return getGameScore()[playerOne.getScoredPoint()] + GAME_SCORE_SEPARATOR
				+ getGameScore()[playerTwo.getScoredPoint()];
	}

	public void incrementPlayerOneScore() {
		playerOne.incrementPlayerScore();
	}

	public void incrementPlayerTwoScore() {
		playerTwo.incrementPlayerScore();
	}

}