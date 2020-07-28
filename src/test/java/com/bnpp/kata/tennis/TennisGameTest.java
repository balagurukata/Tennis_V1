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
    	updatePlayerScore(1,0);
        
        assertThat("Fifteen-Love", is(tennisGame.calculateGameScore()));
    }
    
    @Test
    public void gameScoreShouldBeLoveThirtyWhenPlayerTwoWonFirstAndScondService() {
    	updatePlayerScore(0,2);
        
        assertThat("Love-Thirty", is(tennisGame.calculateGameScore()));
    }
    
    @Test
    public void gameScoreShouldBeFifteenAllWhenBothPlayersWontheOneServiceRespectively() {
    	updatePlayerScore(1,1);
        
        assertThat("Fifteen-All", is(tennisGame.calculateGameScore()));
    }
    
    @Test
    public void gameScoreShouldBeFifteenFortyWhenPlayerOneWonOneServiceAndPlayerTwoWonTheeServices() {
    	updatePlayerScore(1,3);
        
        assertThat("Fifteen-Forty", is(tennisGame.calculateGameScore()));
    }
    
	private void updatePlayerScore(int playerOneNumberOfWins, int playerTwoNumberOfWins) {
		for (int i = 0; i < playerOneNumberOfWins; i++) {
			tennisGame.incrementPlayerOneScore();
		}

		for (int i = 0; i < playerTwoNumberOfWins; i++) {
			tennisGame.incrementPlayerTwoScore();
		}
	}
}