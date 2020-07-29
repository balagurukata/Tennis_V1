package com.bnpp.kata.tennis.model;

public enum PlayerIndicator {

	PLAYERONE("A"), PLAYERTWO("B");

	private String value;

	private PlayerIndicator(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}