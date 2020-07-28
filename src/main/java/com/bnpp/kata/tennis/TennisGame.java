package com.bnpp.kata.tennis;

import com.bnpp.kata.tennis.model.Player;

public class TennisGame {

	private static final String PLAYER_ONE_NAME = "PlayerOne";
	private static final String PLAYER_TWO_NAME = "PlayerTwo";

	private Player playerOne;
	private Player playerTwo;

	public TennisGame() {
		super();
		playerOne = new Player();
		playerOne.setName(PLAYER_ONE_NAME);
		playerTwo = new Player();
		playerTwo.setName(PLAYER_TWO_NAME);
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

	public Object getPlayerTwoName() {
		return playerTwo.getName();
	}

}