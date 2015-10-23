package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	private Score scoreGame;
	
	public TennisGame(){
		this.scoreGame = Score.SCORE_0_0;
	}
	
	public String getResult() {
		if (this.scoreGame == Score.SCORE_15_0)
			return "fifteen_love";
		if (this.scoreGame==Score.SCORE_0_15)
			return "love_fifteen";
		return "love_all";
	}
	
	public void serverWinPoint() {
		if(this.scoreGame==Score.SCORE_0_0)
			this.scoreGame=Score.SCORE_15_0;
	}
	
	public void receiverWinPoint() {
		if(this.scoreGame==Score.SCORE_0_0)
			this.scoreGame=Score.SCORE_0_15;
	}
}
