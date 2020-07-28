package com.bnpp.kata.tennis;

import com.bnpp.kata.tennis.model.Player;

public class TennisGame {

	private static final String FIFTEEN_LOVE_SCORE = "Fifteen-Love";
	private static final String LOVE_ALL_SCORE = "Love-All";
	private static final String PLAYER_ONE_NAME = "PlayerOne";
	private static final String PLAYER_TWO_NAME = "PlayerTwo";

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
		if (playerOne.getScoredPoint() == 1 && playerTwo.getScoredPoint() == 0) {
			return FIFTEEN_LOVE_SCORE;
		}
		return LOVE_ALL_SCORE;
	}

	public void incrementPlayerOneScore() {
		playerOne.incrementPlayerScore();
	}

}