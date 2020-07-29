package com.bnpp.kata.tennis.utils;

public class TennisGameConstants {

	private TennisGameConstants() {
	}

	public static final int MINIMUM_WINNING_DIFFERENCE_POINT = 2;
	public static final int MINIMUM_WINNING_SCORE = 4;
	public static final int MINIMUM_DEUCE_SCORE = 3;
	public static final int ADVANTAGE_DIFFERENCE_POINT = 1;
	public static final int GAME_SCORE_COMP_NEGATIVE_INDEX = -1;

	public static final String WON_THE_GAME_RESULT = " won the game";
	public static final String PLAYER_ONE_NAME = "PlayerOne";
	public static final String PLAYER_TWO_NAME = "PlayerTwo";
	public static final String GAME_SCORE_ALL = "All";
	public static final String DEUCE_GAME_SCORE = "Deuce";
	public static final String HAS_ADVANTAGE_SCORE = " has advantage";
	public static final String GAME_OVER_MESSAGE = "******** Game Over ! ********";
	public static final String CURRENT_GAME_SCORE = "Current Game score: %s";
	public static final String ENTER_PLAYER_INDICATE_MESSAGE = "Press 'A' to indicate '%s' win the current service or Press 'B' to indicate ' %s' win the current service";
	public static final String ENTER_PLAYER2_NAME_MESSAGE = "Please enter the player2 name";
	public static final String ENTER_PLAYER1_NAME_MESSAGE = "Please enter the player1 name";
	public static final String WELCOME_GAME_MESSAGE = "******** Welcome to play the Tennis Game! ********";

	public static final char GAME_SCORE_SEPARATOR = '-';

	private static final String[] GAME_SCORE = { "Love", "Fifteen", "Thirty", "Forty" };
	
	public static String[] getGameScore() {
		return GAME_SCORE;
	}
}