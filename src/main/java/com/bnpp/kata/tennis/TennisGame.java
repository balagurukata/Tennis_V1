package com.bnpp.kata.tennis;


import com.bnpp.kata.tennis.model.Player;
import static com.bnpp.kata.tennis.utils.TennisGameConstants.*;

public class TennisGame {

	private Player playerOne;
	private Player playerTwo;

	public TennisGame() {
		this(PLAYER_ONE_NAME,PLAYER_TWO_NAME);
	}

	public TennisGame(String playerOneName, String playerTwoName) {
		playerOne = new Player(playerOneName);
		playerTwo = new Player(playerTwoName);
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
		} else if (isAnyPlayerEligibleToWin()) {
			gameScore = isPlayersScoreDifferenceEqualToOne() ? getEligibleWinningPlayerScore(HAS_ADVANTAGE_SCORE)
					: getEligibleWinningPlayerScore(WON_THE_GAME_RESULT);
		} else {
			gameScore = generateGameScore();
		}
		return gameScore;
	}

	private String getEligibleWinningPlayerScore(String winningScenario) {
		return getTopScoredPlayerName() + winningScenario;
	}

	private boolean isPlayersScoreDifferenceEqualToOne() {
		return Math.abs(playerOne.getScoredPoint() - playerTwo.getScoredPoint()) == ADVANTAGE_DIFFERENCE_POINT;
	}

	private boolean isAnyPlayerEligibleToWin() {
		return playerOne.getScoredPoint() >= MINIMUM_WINNING_SCORE || playerTwo.getScoredPoint() >= MINIMUM_WINNING_SCORE;
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

	public void addServicePointToWinner(String winningPlayerIndicator) {
		if("A".equals(winningPlayerIndicator)) {
			incrementPlayerOneScore();
		}
	}
}