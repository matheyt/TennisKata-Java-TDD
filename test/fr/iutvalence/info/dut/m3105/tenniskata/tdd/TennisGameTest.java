package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	
	@Test
	public void ifScoreIs0_0ResultIsLove_all()
	{
		TennisGame tennisGame= new TennisGame();
		Assert.assertEquals("love_all",tennisGame.getResult());
	}
	
	@Test
	public void  ifScoreIs15_0ResultIsFifteen_Love()
	{	
		
		TennisGame tennisGame = new TennisGame();
		tennisGame.setScoreServer(TennisGame.A_MARQUE1);
		Assert.assertEquals("fifteen_love",tennisGame.getResult());
	}
	
	@Test
	public void  ifScoreIs0_15ResultIsLove_Fifteen()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.setScoreReceiver(TennisGame.A_MARQUE1);
		Assert.assertEquals("love_fifteen", tennisGame.getResult());
	}
	
}
