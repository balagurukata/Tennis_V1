package com.bnpp.kata.tennis;


import com.bnpp.kata.tennis.model.Player;

public class TennisGame {

	private static final String PLAYER_ONE_NAME = "PlayerOne";
	private static final String PLAYER_TWO_NAME = "PlayerTwo";
	private static final String GAME_SCORE_ALL = "All";
	
	private static final char GAME_SCORE_SEPARATOR = '-';
	
	private static final String[] GAME_SCORE = { "Love", "Fifteen", "Thirty","Forty" };



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

		if (playerOne.getScoredPoint() == playerTwo.getScoredPoint()) {
			gameScore = generateGameAllScore();
		} else {
			gameScore = generateGameScore();
		}
		return gameScore;
	}

	private String generateGameAllScore() {
		return GAME_SCORE[playerOne.getScoredPoint()] + GAME_SCORE_SEPARATOR + GAME_SCORE_ALL;
	}

	private String generateGameScore() {
		return GAME_SCORE[playerOne.getScoredPoint()] + GAME_SCORE_SEPARATOR
				+ GAME_SCORE[playerTwo.getScoredPoint()];
	}

	public void incrementPlayerOneScore() {
		playerOne.incrementPlayerScore();
	}

	public void incrementPlayerTwoScore() {
		playerTwo.incrementPlayerScore();
	}

}