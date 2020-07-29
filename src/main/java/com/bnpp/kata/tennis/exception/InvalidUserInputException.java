package com.bnpp.kata.tennis.exception;

public class InvalidUserInputException extends Exception {
	private static final long serialVersionUID = 112325567260101798L;
	private final String errorMessage;

	public InvalidUserInputException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
}