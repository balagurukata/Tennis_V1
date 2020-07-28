package com.bnpp.kata.tennis;

import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class TennisGameTest {

	@Test
	public void playerOnwScoredShouldBeZeroBeforeGameBegins() {
		TennisGame tennisGame = new TennisGame();

		assertThat(0, is(tennisGame.getPlayerOneScoredPoint()));
	}
}