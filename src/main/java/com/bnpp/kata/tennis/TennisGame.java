package com.bnpp.kata.tennis;

public class TennisGame {

	private static final String PLAYER_ONE_NAME = "PlayerOne";
	private static final String PLAYER_TWO_NAME = "PlayerTwo";
	
	private int playerOneScoredPoint;
	private int playerTwoScoredPoint;

	public int getPlayerOneScoredPoint() {
		return playerOneScoredPoint;
	}

	public int getPlayerTwoScoredPoint() {
		return playerTwoScoredPoint;
	}

	public String getPlayerOneName() {
		return PLAYER_ONE_NAME;
	}

	public Object getPlayerTwoName() {
		return PLAYER_TWO_NAME;
	}

}