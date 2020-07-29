package com.bnpp.kata.tennis.utils;

public class TennisGameConstants {

	private TennisGameConstants() {
	}

	public static final int MINIMUM_WINNING_DIFFERENCE_POINT = 2;
	public static final int MINIMUM_WINNING_SCORE = 4;

	public static final String WON_THE_GAME_RESULT = " won the game";
	public static final String PLAYER_ONE_NAME = "PlayerOne";
	public static final String PLAYER_TWO_NAME = "PlayerTwo";
	public static final String GAME_SCORE_ALL = "All";

	public static final char GAME_SCORE_SEPARATOR = '-';

	private static final String[] GAME_SCORE = { "Love", "Fifteen", "Thirty", "Forty" };
	
	public static String[] getGameScore() {
		return GAME_SCORE;
	}
}