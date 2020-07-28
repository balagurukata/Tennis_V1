package com.bnpp.kata.tennis;

import static org.junit.Assert.assertThat;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class TennisGameTest {
	
	TennisGame tennisGame;
	
	@Before
	public void initialize() {
		tennisGame = new TennisGame();
	}

	@Test
	public void playerOneScoredShouldBeZeroBeforeGameBegins() {

		assertThat(0, is(tennisGame.getPlayerOneScoredPoint()));
	}

	@Test
	public void playerTwoScoredShouldBeZeroBeforeGameBegins() {

		assertThat(0, is(tennisGame.getPlayerTwoScoredPoint()));
	}
	
	@Test
	public void playerOneNameShouldBeInitializedAsPlayerOneBeforeGameBegins() {

		assertThat("PlayerOne", is(tennisGame.getPlayerOneName()));
	}
	
	@Test
	public void playerTwoNameShouldBeInitializedAsPlayerTwoBeforeGameBegins() {

		assertThat("PlayerTwo", is(tennisGame.getPlayerTwoName()));
	}
	
	@Test
	public void gameScoreShouldBeLoveAllBeforeGameBegins() {
		
		assertThat("Love-All", is(tennisGame.calculateGameScore()));
	}
	
    @Test
    public void playerOneScoreShouldBeFifteenLoveWhenPlayerOneWontheFirstService() {
        tennisGame.incrementPlayerOneScore();
        
        assertThat("Fifteen-Love", is(tennisGame.calculateGameScore()));
    }
}