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

}
